/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
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
 * @see <a href="https://avro.apache.org/docs/current/specification/">JSON based
 *      schema definition</a>
 */
public class ParseContext extends ParseContextTransactions {

  /**
   * Create a {@code ParseContext} for the default/{@code null} namespace, using
   * default name validation for new schemata.
   */
  public ParseContext() {
    this(NameValidator.UTF_VALIDATOR);
  }

  /**
   * Create a {@code ParseContext} using the specified name validation for new
   * schemata.
   */
  public ParseContext(NameValidator nameValidator) {
    super(requireNonNull(nameValidator), new LinkedHashMap<>(), new LinkedHashMap<>());
  }
}

/**
 * Holds schema lookup and registration behavior. Splitting this behavior from
 * the public facade keeps each class focused without changing ParseContext's
 * API.
 */
abstract class ParseContextRegistry {
  private static final Map<String, Schema.Type> PRIMITIVES = new HashMap<>();
  protected static final Set<Schema.Type> NAMED_SCHEMA_TYPES = EnumSet.of(Schema.Type.RECORD, Schema.Type.ENUM,
      Schema.Type.FIXED);

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

  protected final Map<String, Schema> oldSchemas;
  protected final Map<String, Schema> newSchemas;

  // Visible for use in JsonSchemaParser.
  final NameValidator nameValidator;

  protected SchemaResolver.ResolvingVisitor resolvingVisitor;

  ParseContextRegistry(NameValidator nameValidator, Map<String, Schema> oldSchemas, Map<String, Schema> newSchemas) {
    this.nameValidator = nameValidator;
    this.oldSchemas = oldSchemas;
    this.newSchemas = newSchemas;
    this.resolvingVisitor = null;
  }

  public boolean contains(String name) {
    return PRIMITIVES.containsKey(name) || oldSchemas.containsKey(name) || newSchemas.containsKey(name);
  }

  public Schema find(String name, String namespace) {
    Schema.Type type = PRIMITIVES.get(name);
    if (type != null) {
      return Schema.create(type);
    }

    String fullName = namespace != null && name.lastIndexOf('.') < 0 ? namespace + "." + name : name;
    Schema schema = getNamedSchema(fullName);
    if (schema == null) {
      schema = getNamedSchema(name);
    }
    return schema != null ? schema : SchemaResolver.unresolvedSchema(fullName);
  }

  public Schema getNamedSchema(String fullName) {
    Schema schema = oldSchemas.get(fullName);
    return schema == null ? newSchemas.get(fullName) : schema;
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
      return;
    }

    resolvingVisitor = null;
    Schema previouslyAddedSchema = newSchemas.putIfAbsent(fullName, schema);
    if (previouslyAddedSchema != null && !previouslyAddedSchema.equals(schema)) {
      throw new SchemaParseException("Can't redefine: " + fullName);
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

  public Map<String, Schema> typesByName() {
    LinkedHashMap<String, Schema> result = new LinkedHashMap<>();
    result.putAll(oldSchemas);
    result.putAll(newSchemas);
    return result;
  }
}

/** Transaction lifecycle operations for a parse context. */
abstract class ParseContextTransactions extends ParseContextResolution {

  ParseContextTransactions(NameValidator nameValidator, Map<String, Schema> oldSchemas,
      Map<String, Schema> newSchemas) {
    super(nameValidator, oldSchemas, newSchemas);
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
        return parsedNamedSchemas.stream().map(ParseContextTransactions.this::resolve).collect(Collectors.toList());
      }
    };
    commit();
    return parseResult;
  }

  public void rollback() {
    newSchemas.clear();
  }
}

/** Schema resolution operations for a parse context. */
abstract class ParseContextResolution extends ParseContextRegistry {

  ParseContextResolution(NameValidator nameValidator, Map<String, Schema> oldSchemas, Map<String, Schema> newSchemas) {
    super(nameValidator, oldSchemas, newSchemas);
  }

  public List<Schema> resolveAllSchemas() {
    ensureSchemasAreResolved();
    return new ArrayList<>(oldSchemas.values());
  }

  public Schema resolve(Schema schema) {
    ensureSchemasAreResolved();
    if (NAMED_SCHEMA_TYPES.contains(schema.getType()) && schema.getFullName() != null) {
      return requireNonNull(oldSchemas.get(schema.getFullName()), () -> "Unknown schema: " + schema.getFullName());
    }

    Schemas.visit(schema, resolvingVisitor);
    return resolvingVisitor.getResolved(schema);
  }

  private void ensureSchemasAreResolved() {
    if (hasNewSchemas()) {
      throw new IllegalStateException("Schemas cannot be resolved unless the ParseContext is committed.");
    }
    if (resolvingVisitor != null) {
      return;
    }

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
