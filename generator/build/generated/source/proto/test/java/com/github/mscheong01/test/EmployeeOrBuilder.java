// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.github.mscheong01.test;

public interface EmployeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.test.Employee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>.com.example.test.Job job = 3;</code>
   * @return The enum numeric value on the wire for job.
   */
  int getJobValue();
  /**
   * <code>.com.example.test.Job job = 3;</code>
   * @return The job.
   */
  com.github.mscheong01.test.Job getJob();
}