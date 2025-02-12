/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/database.proto

package com.google.firestore.admin.v1;

public interface DatabaseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.admin.v1.Database)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the Database.
   * Format: `projects/{project}/databases/{database}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the Database.
   * Format: `projects/{project}/databases/{database}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The location of the database. Available locations are listed at
   * https://cloud.google.com/firestore/docs/locations.
   * </pre>
   *
   * <code>string location_id = 9;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * The location of the database. Available locations are listed at
   * https://cloud.google.com/firestore/docs/locations.
   * </pre>
   *
   * <code>string location_id = 9;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();

  /**
   *
   *
   * <pre>
   * The type of the database.
   * See https://cloud.google.com/datastore/docs/firestore-or-datastore for
   * information about how to choose.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Database.DatabaseType type = 10;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the database.
   * See https://cloud.google.com/datastore/docs/firestore-or-datastore for
   * information about how to choose.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Database.DatabaseType type = 10;</code>
   *
   * @return The type.
   */
  com.google.firestore.admin.v1.Database.DatabaseType getType();

  /**
   *
   *
   * <pre>
   * The concurrency control mode to use for this database.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Database.ConcurrencyMode concurrency_mode = 15;</code>
   *
   * @return The enum numeric value on the wire for concurrencyMode.
   */
  int getConcurrencyModeValue();
  /**
   *
   *
   * <pre>
   * The concurrency control mode to use for this database.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Database.ConcurrencyMode concurrency_mode = 15;</code>
   *
   * @return The concurrencyMode.
   */
  com.google.firestore.admin.v1.Database.ConcurrencyMode getConcurrencyMode();

  /**
   *
   *
   * <pre>
   * Output only. The period during which past versions of data are retained in
   * the database.
   *
   * Any [read][google.firestore.v1.GetDocumentRequest.read_time]
   * or [query][google.firestore.v1.ListDocumentsRequest.read_time] can specify
   * a `read_time` within this window, and will read the state of the database
   * at that time.
   *
   * If the PITR feature is enabled, the retention period is 7 days. Otherwise,
   * the retention period is 1 hour.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration version_retention_period = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the versionRetentionPeriod field is set.
   */
  boolean hasVersionRetentionPeriod();
  /**
   *
   *
   * <pre>
   * Output only. The period during which past versions of data are retained in
   * the database.
   *
   * Any [read][google.firestore.v1.GetDocumentRequest.read_time]
   * or [query][google.firestore.v1.ListDocumentsRequest.read_time] can specify
   * a `read_time` within this window, and will read the state of the database
   * at that time.
   *
   * If the PITR feature is enabled, the retention period is 7 days. Otherwise,
   * the retention period is 1 hour.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration version_retention_period = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The versionRetentionPeriod.
   */
  com.google.protobuf.Duration getVersionRetentionPeriod();
  /**
   *
   *
   * <pre>
   * Output only. The period during which past versions of data are retained in
   * the database.
   *
   * Any [read][google.firestore.v1.GetDocumentRequest.read_time]
   * or [query][google.firestore.v1.ListDocumentsRequest.read_time] can specify
   * a `read_time` within this window, and will read the state of the database
   * at that time.
   *
   * If the PITR feature is enabled, the retention period is 7 days. Otherwise,
   * the retention period is 1 hour.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration version_retention_period = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getVersionRetentionPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The earliest timestamp at which older versions of the data can
   * be read from the database. See [version_retention_period] above; this field
   * is populated with `now - version_retention_period`.
   *
   * This value is continuously updated, and becomes stale the moment it is
   * queried. If you are using this value to recover data, make sure to account
   * for the time from the moment when the value is queried to the moment when
   * you initiate the recovery.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp earliest_version_time = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the earliestVersionTime field is set.
   */
  boolean hasEarliestVersionTime();
  /**
   *
   *
   * <pre>
   * Output only. The earliest timestamp at which older versions of the data can
   * be read from the database. See [version_retention_period] above; this field
   * is populated with `now - version_retention_period`.
   *
   * This value is continuously updated, and becomes stale the moment it is
   * queried. If you are using this value to recover data, make sure to account
   * for the time from the moment when the value is queried to the moment when
   * you initiate the recovery.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp earliest_version_time = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The earliestVersionTime.
   */
  com.google.protobuf.Timestamp getEarliestVersionTime();
  /**
   *
   *
   * <pre>
   * Output only. The earliest timestamp at which older versions of the data can
   * be read from the database. See [version_retention_period] above; this field
   * is populated with `now - version_retention_period`.
   *
   * This value is continuously updated, and becomes stale the moment it is
   * queried. If you are using this value to recover data, make sure to account
   * for the time from the moment when the value is queried to the moment when
   * you initiate the recovery.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp earliest_version_time = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEarliestVersionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether to enable the PITR feature on this database.
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.Database.PointInTimeRecoveryEnablement point_in_time_recovery_enablement = 21;
   * </code>
   *
   * @return The enum numeric value on the wire for pointInTimeRecoveryEnablement.
   */
  int getPointInTimeRecoveryEnablementValue();
  /**
   *
   *
   * <pre>
   * Whether to enable the PITR feature on this database.
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.Database.PointInTimeRecoveryEnablement point_in_time_recovery_enablement = 21;
   * </code>
   *
   * @return The pointInTimeRecoveryEnablement.
   */
  com.google.firestore.admin.v1.Database.PointInTimeRecoveryEnablement
      getPointInTimeRecoveryEnablement();

  /**
   *
   *
   * <pre>
   * The App Engine integration mode to use for this database.
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.Database.AppEngineIntegrationMode app_engine_integration_mode = 19;
   * </code>
   *
   * @return The enum numeric value on the wire for appEngineIntegrationMode.
   */
  int getAppEngineIntegrationModeValue();
  /**
   *
   *
   * <pre>
   * The App Engine integration mode to use for this database.
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.Database.AppEngineIntegrationMode app_engine_integration_mode = 19;
   * </code>
   *
   * @return The appEngineIntegrationMode.
   */
  com.google.firestore.admin.v1.Database.AppEngineIntegrationMode getAppEngineIntegrationMode();

  /**
   *
   *
   * <pre>
   * Output only. The key_prefix for this database. This key_prefix is used, in
   * combination with the project id ("&lt;key prefix&gt;~&lt;project id&gt;") to construct
   * the application id that is returned from the Cloud Datastore APIs in Google
   * App Engine first generation runtimes.
   *
   * This value may be empty in which case the appid to use for URL-encoded keys
   * is the project_id (eg: foo instead of v~foo).
   * </pre>
   *
   * <code>string key_prefix = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The keyPrefix.
   */
  java.lang.String getKeyPrefix();
  /**
   *
   *
   * <pre>
   * Output only. The key_prefix for this database. This key_prefix is used, in
   * combination with the project id ("&lt;key prefix&gt;~&lt;project id&gt;") to construct
   * the application id that is returned from the Cloud Datastore APIs in Google
   * App Engine first generation runtimes.
   *
   * This value may be empty in which case the appid to use for URL-encoded keys
   * is the project_id (eg: foo instead of v~foo).
   * </pre>
   *
   * <code>string key_prefix = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for keyPrefix.
   */
  com.google.protobuf.ByteString getKeyPrefixBytes();

  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 99;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 99;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
