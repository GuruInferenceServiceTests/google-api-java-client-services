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

package com.google.api.services.monitoring.v1.model;

/**
 * A filter that ranks streams based on their statistical relation to other streams in a request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StatisticalTimeSeriesFilter extends com.google.api.client.json.GenericJson {

  /**
   * How many time series to output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numTimeSeries;

  /**
   * rankingMethod is applied to a set of time series, and then the produced value for each
   * individual time series is used to compare a given time series to others. These are methods that
   * cannot be applied stream-by-stream, but rather require the full context of a request to
   * evaluate time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rankingMethod;

  /**
   * How many time series to output.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumTimeSeries() {
    return numTimeSeries;
  }

  /**
   * How many time series to output.
   * @param numTimeSeries numTimeSeries or {@code null} for none
   */
  public StatisticalTimeSeriesFilter setNumTimeSeries(java.lang.Integer numTimeSeries) {
    this.numTimeSeries = numTimeSeries;
    return this;
  }

  /**
   * rankingMethod is applied to a set of time series, and then the produced value for each
   * individual time series is used to compare a given time series to others. These are methods that
   * cannot be applied stream-by-stream, but rather require the full context of a request to
   * evaluate time series.
   * @return value or {@code null} for none
   */
  public java.lang.String getRankingMethod() {
    return rankingMethod;
  }

  /**
   * rankingMethod is applied to a set of time series, and then the produced value for each
   * individual time series is used to compare a given time series to others. These are methods that
   * cannot be applied stream-by-stream, but rather require the full context of a request to
   * evaluate time series.
   * @param rankingMethod rankingMethod or {@code null} for none
   */
  public StatisticalTimeSeriesFilter setRankingMethod(java.lang.String rankingMethod) {
    this.rankingMethod = rankingMethod;
    return this;
  }

  @Override
  public StatisticalTimeSeriesFilter set(String fieldName, Object value) {
    return (StatisticalTimeSeriesFilter) super.set(fieldName, value);
  }

  @Override
  public StatisticalTimeSeriesFilter clone() {
    return (StatisticalTimeSeriesFilter) super.clone();
  }

}
