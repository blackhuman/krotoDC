// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: well_known_types.proto

package com.github.mscheong01.wellknowntypes;

public interface TimeMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.wellknowntypes.TimeMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>.google.protobuf.Duration duration = 2;</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <code>.google.protobuf.Duration duration = 2;</code>
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}