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
 * The request for ExecuteBatchDml.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecuteBatchDmlRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. A per-transaction sequence number used to identify this request. This field makes
   * each request idempotent such that if the request is received multiple times, at most one will
   * succeed.
   *
   * The sequence number must be monotonically increasing within the transaction. If a request
   * arrives for the first time with an out-of-order sequence number, the transaction may be
   * aborted. Replays of previously handled requests will yield the same response as the first
   * execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long seqno;

  /**
   * Required. The list of statements to execute in this batch. Statements are executed serially,
   * such that the effects of statement `i` are visible to statement `i+1`. Each statement must be a
   * DML statement. Execution stops at the first failed statement; the remaining statements are not
   * executed.
   *
   * Callers must provide at least one statement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Statement> statements;

  /**
   * Required. The transaction to use. Must be a read-write transaction.
   *
   * To protect against replays, single-use transactions are not supported. The caller must either
   * supply an existing transaction ID or begin a new transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionSelector transaction;

  /**
   * Required. A per-transaction sequence number used to identify this request. This field makes
   * each request idempotent such that if the request is received multiple times, at most one will
   * succeed.
   *
   * The sequence number must be monotonically increasing within the transaction. If a request
   * arrives for the first time with an out-of-order sequence number, the transaction may be
   * aborted. Replays of previously handled requests will yield the same response as the first
   * execution.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSeqno() {
    return seqno;
  }

  /**
   * Required. A per-transaction sequence number used to identify this request. This field makes
   * each request idempotent such that if the request is received multiple times, at most one will
   * succeed.
   *
   * The sequence number must be monotonically increasing within the transaction. If a request
   * arrives for the first time with an out-of-order sequence number, the transaction may be
   * aborted. Replays of previously handled requests will yield the same response as the first
   * execution.
   * @param seqno seqno or {@code null} for none
   */
  public ExecuteBatchDmlRequest setSeqno(java.lang.Long seqno) {
    this.seqno = seqno;
    return this;
  }

  /**
   * Required. The list of statements to execute in this batch. Statements are executed serially,
   * such that the effects of statement `i` are visible to statement `i+1`. Each statement must be a
   * DML statement. Execution stops at the first failed statement; the remaining statements are not
   * executed.
   *
   * Callers must provide at least one statement.
   * @return value or {@code null} for none
   */
  public java.util.List<Statement> getStatements() {
    return statements;
  }

  /**
   * Required. The list of statements to execute in this batch. Statements are executed serially,
   * such that the effects of statement `i` are visible to statement `i+1`. Each statement must be a
   * DML statement. Execution stops at the first failed statement; the remaining statements are not
   * executed.
   *
   * Callers must provide at least one statement.
   * @param statements statements or {@code null} for none
   */
  public ExecuteBatchDmlRequest setStatements(java.util.List<Statement> statements) {
    this.statements = statements;
    return this;
  }

  /**
   * Required. The transaction to use. Must be a read-write transaction.
   *
   * To protect against replays, single-use transactions are not supported. The caller must either
   * supply an existing transaction ID or begin a new transaction.
   * @return value or {@code null} for none
   */
  public TransactionSelector getTransaction() {
    return transaction;
  }

  /**
   * Required. The transaction to use. Must be a read-write transaction.
   *
   * To protect against replays, single-use transactions are not supported. The caller must either
   * supply an existing transaction ID or begin a new transaction.
   * @param transaction transaction or {@code null} for none
   */
  public ExecuteBatchDmlRequest setTransaction(TransactionSelector transaction) {
    this.transaction = transaction;
    return this;
  }

  @Override
  public ExecuteBatchDmlRequest set(String fieldName, Object value) {
    return (ExecuteBatchDmlRequest) super.set(fieldName, value);
  }

  @Override
  public ExecuteBatchDmlRequest clone() {
    return (ExecuteBatchDmlRequest) super.clone();
  }

}
