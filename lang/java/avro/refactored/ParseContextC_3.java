/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.avro;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.avro.util.SchemaResolver;
import org.apache.avro.util.Schemas;

/**
 * Class to define a name context, useful to reference schemata with.
 *
 * <p>
 * This class is NOT thread-safe.
 * </p>
 *
 * <p>
 * Note: this class has no use for most Avro users, but is a key component when
 * implementing a schema parser.
 * </p>
 *
 * @see <a href="https://avro.apache.org/docs/current/specification/">JSON based
 *      schema definition</a>
 */
public class ParseContext extends ParseContextCore {

  /**
   * Create a {@code ParseContext} for the default/{@code null} namespace, using
   * default name validation for new schemata.
   */
  public ParseContext() {
    super(NameValidator.UTF_VALIDATOR);
  }

  /**
   * Create a {@code ParseContext} using the specified name validation for new
   * schemata.
   */
  public ParseContext(NameValidator nameValidator) {
    super(nameValidator);
  }
}

/**
 * Internal implementation extracted so that {@link ParseContext} remains a
 * small public facade while preserving its complete inherited API.
 */
class ParseContextCore {
  private static final Map<String, Schema.Type> PRIMITIVES = new HashMap<>();

  static {
    PRIMITIVES.put("string", Schema.Type.STRING);
    PRIMITIVES.put("bytes", Schema.Type.BYTES);
    PRIMITIVES.put("int", Schema.Type.INT);
    PRIMITIVES.put("long", Schema.Type.LONG);
    PRIMITIVES.put("float", Schema.Type.FLOAT);
    PRIMITIVES.put("double", Schema.Type.DOUBLE);
    PRIMITIVES.put("boolean", Schema.Type.BOOLEAN);
    PRIMITIVES.put("null", Schema.Type.NULL);
  }

  private static final Set<Schema.Type> NAMED_SCHEMA_TYPES = EnumSet.of(Schema.Type.RECORD, Schema.Type.ENUM,
      Schema.Type.FIXED);

  /**
   * Collection of old schemata. Can contain unresolved references if not
   * resolved.
   */
  private final Map<String, Schema> oldSchemas;

  /** Collection of new schemata. Can contain unresolved references. */
  private final Map<String, Schema> newSchemas;

  /** The name validator to use. Visible for use in JsonSchemaParser. */
  final NameValidator nameValidator;

  private SchemaResolver.ResolvingVisitor resolvingVisitor;

  ParseContextCore(NameValidator nameValidator) {
    this(requireNonNull(nameValidator), new LinkedHashMap<>(), new LinkedHashMap<>());
  }

  private ParseContextCore(NameValidator nameValidator, Map<String, Schema> oldSchemas,
      Map<String, Schema> newSchemas) {
    this.nameValidator = nameValidator;
    this.oldSchemas = oldSchemas;
    this.newSchemas = newSchemas;
    resolvingVisitor = null;
  }

  public boolean contains(String name) {
    return PRIMITIVES.containsKey(name) || oldSchemas.containsKey(name) || newSchemas.containsKey(name);
  }

  public Schema find(String name, String namespace) {
    Schema.Type type = PRIMITIVES.get(name);
    if (type != null) {
      return Schema.create(type);
    }

    String fullName = fullName(name, namespace);
    Schema schema = getNamedSchema(fullName);
    if (schema == null) {
      schema = getNamedSchema(name);
    }
    return schema != null ? schema : SchemaResolver.unresolvedSchema(fullName);
  }

  private String fullName(String name, String namespace) {
    if (namespace != null && name.lastIndexOf('.') < 0) {
      return namespace + "." + name;
    }
    return name;
  }

  public Schema getNamedSchema(String fullName) {
    Schema schema = oldSchemas.get(fullName);
    if (schema == null) {
      schema = newSchemas.get(fullName);
    }
    return schema;
  }

  public void put(Schema schema) {
    if (!NAMED_SCHEMA_TYPES.contains(schema.getType())) {
      throw new AvroTypeException("You can only put a named schema into the context");
    }

    String fullName = requireValidFullName(schema.getFullName());
    Schema alreadyKnownSchema = oldSchemas.get(fullName);
    if (alreadyKnownSchema != null) {
      if (!schema.equals(alreadyKnownSchema)) {
        throw new SchemaParseException("Can't redefine: " + fullName);
      }
    } else {
      resolvingVisitor = null;
      Schema previouslyAddedSchema = newSchemas.putIfAbsent(fullName, schema);
      if (previouslyAddedSchema != null && !previouslyAddedSchema.equals(schema)) {
        throw new SchemaParseException("Can't redefine: " + fullName);
      }
    }
  }

  private String requireValidFullName(String fullName) {
    String[] names = fullName.split("\\.");
    for (int i = 0; i < names.length - 1; i++) {
      validateName(names[i], "Namespace part");
    }
    validateName(names[names.length - 1], "Name");
    return fullName;
  }

  private void validateName(String name, String typeOfName) {
    NameValidator.Result result = nameValidator.validate(name);
    if (!result.isOK()) {
      throw new SchemaParseException(typeOfName + " \"" + name + "\" is invalid: " + result.getErrors());
    }
  }

  public boolean hasNewSchemas() {
    return !newSchemas.isEmpty();
  }

  public void commit() {
    oldSchemas.putAll(newSchemas);
    newSchemas.clear();
  }

  public SchemaParser.ParseResult commit(Schema mainSchema) {
    List<Schema> parsedNamedSchemas = new ArrayList<>(newSchemas.values());
    SchemaParser.ParseResult parseResult = new SchemaParser.ParseResult() {
      @Override
      public Schema mainSchema() {
        return mainSchema == null ? null : resolve(mainSchema);
      }

      @Override
      public List<Schema> parsedNamedSchemas() {
        return parsedNamedSchemas.stream().map(ParseContextCore.this::resolve).collect(Collectors.toList());
      }
    };
    commit();
    return parseResult;
  }

  public void rollback() {
    newSchemas.clear();
  }

  public List<Schema> resolveAllSchemas() {
    ensureSchemasAreResolved();
    return new ArrayList<>(oldSchemas.values());
  }

  private void ensureSchemasAreResolved() {
    if (hasNewSchemas()) {
      throw new IllegalStateException("Schemas cannot be resolved unless the ParseContext is committed.");
    }
    if (resolvingVisitor == null) {
      NameValidator saved = Schema.getNameValidator();
      try {
        Schema.setNameValidator(nameValidator);
        SchemaResolver.ResolvingVisitor visitor = new SchemaResolver.ResolvingVisitor(oldSchemas::get);
        oldSchemas.values().forEach(schema -> Schemas.visit(schema, visitor));
        for (Map.Entry<String, Schema> entry : oldSchemas.entrySet()) {
          entry.setValue(visitor.getResolved(entry.getValue()));
        }
        resolvingVisitor = visitor;
      } finally {
        Schema.setNameValidator(saved);
      }
    }
  }

  public Schema resolve(Schema schema) {
    ensureSchemasAreResolved();
    if (NAMED_SCHEMA_TYPES.contains(schema.getType()) && schema.getFullName() != null) {
      return requireNonNull(oldSchemas.get(schema.getFullName()), () -> "Unknown schema: " + schema.getFullName());
    }

    Schemas.visit(schema, resolvingVisitor);
    return resolvingVisitor.getResolved(schema);
  }

  public Map<String, Schema> typesByName() {
    LinkedHashMap<String, Schema> result = new LinkedHashMap<>();
    result.putAll(oldSchemas);
    result.putAll(newSchemas);
    return result;
  }
}
