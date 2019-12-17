/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.spanner.v1.model;

/**
 * Enqueues the given DDL statements to be applied, in order but not necessarily all at once, to the
 * database schema at some point (or points) in the future. The server checks that the statements
 * are executable (syntactically valid, name tables that exist, etc.) before enqueueing them, but
 * they may still fail upon later execution (e.g., if a statement from another batch of statements
 * is applied first and it conflicts in some way, or if there is some data-related problem like a
 * `NULL` value in a column to which `NOT NULL` would be added). If a statement fails, all
 * subsequent statements in the batch are automatically cancelled.
 *
 * Each batch of statements is assigned a name which can be used with the Operations API to monitor
 * progress. See the operation_id field for more details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateDatabaseDdlRequest extends com.google.api.client.json.GenericJson {

  /**
   * If empty, the new update request is assigned an automatically-generated operation ID.
   * Otherwise, `operation_id` is used to construct the name of the resulting Operation.
   *
   * Specifying an explicit operation ID simplifies determining whether the statements were executed
   * in the event that the UpdateDatabaseDdl call is replayed, or the return value is otherwise
   * lost: the database and `operation_id` fields can be combined to form the name of the resulting
   * longrunning.Operation: `/operations/`.
   *
   * `operation_id` should be unique within the database, and must be a valid identifier: `a-z*`.
   * Note that automatically-generated operation IDs always begin with an underscore. If the named
   * operation already exists, UpdateDatabaseDdl returns `ALREADY_EXISTS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * Required. DDL statements to be applied to the database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> statements;

  /**
   * If empty, the new update request is assigned an automatically-generated operation ID.
   * Otherwise, `operation_id` is used to construct the name of the resulting Operation.
   *
   * Specifying an explicit operation ID simplifies determining whether the statements were executed
   * in the event that the UpdateDatabaseDdl call is replayed, or the return value is otherwise
   * lost: the database and `operation_id` fields can be combined to form the name of the resulting
   * longrunning.Operation: `/operations/`.
   *
   * `operation_id` should be unique within the database, and must be a valid identifier: `a-z*`.
   * Note that automatically-generated operation IDs always begin with an underscore. If the named
   * operation already exists, UpdateDatabaseDdl returns `ALREADY_EXISTS`.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * If empty, the new update request is assigned an automatically-generated operation ID.
   * Otherwise, `operation_id` is used to construct the name of the resulting Operation.
   *
   * Specifying an explicit operation ID simplifies determining whether the statements were executed
   * in the event that the UpdateDatabaseDdl call is replayed, or the return value is otherwise
   * lost: the database and `operation_id` fields can be combined to form the name of the resulting
   * longrunning.Operation: `/operations/`.
   *
   * `operation_id` should be unique within the database, and must be a valid identifier: `a-z*`.
   * Note that automatically-generated operation IDs always begin with an underscore. If the named
   * operation already exists, UpdateDatabaseDdl returns `ALREADY_EXISTS`.
   * @param operationId operationId or {@code null} for none
   */
  public UpdateDatabaseDdlRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Required. DDL statements to be applied to the database.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStatements() {
    return statements;
  }

  /**
   * Required. DDL statements to be applied to the database.
   * @param statements statements or {@code null} for none
   */
  public UpdateDatabaseDdlRequest setStatements(java.util.List<java.lang.String> statements) {
    this.statements = statements;
    return this;
  }

  @Override
  public UpdateDatabaseDdlRequest set(String fieldName, Object value) {
    return (UpdateDatabaseDdlRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateDatabaseDdlRequest clone() {
    return (UpdateDatabaseDdlRequest) super.clone();
  }

}
