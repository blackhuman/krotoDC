// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.github.mscheong01.test;

/**
 * Protobuf type {@code com.example.test.OneOfMessage}
 */
public final class OneOfMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.test.OneOfMessage)
    OneOfMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OneOfMessage.newBuilder() to construct.
  private OneOfMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OneOfMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OneOfMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.mscheong01.test.Test.internal_static_com_example_test_OneOfMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.mscheong01.test.Test.internal_static_com_example_test_OneOfMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.mscheong01.test.OneOfMessage.class, com.github.mscheong01.test.OneOfMessage.Builder.class);
  }

  private int oneofFieldCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object oneofField_;
  public enum OneofFieldCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ONEOF_STRING(1),
    ONEOF_INT(2),
    ONEOF_PERSON(3),
    ONEOFFIELD_NOT_SET(0);
    private final int value;
    private OneofFieldCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OneofFieldCase valueOf(int value) {
      return forNumber(value);
    }

    public static OneofFieldCase forNumber(int value) {
      switch (value) {
        case 1: return ONEOF_STRING;
        case 2: return ONEOF_INT;
        case 3: return ONEOF_PERSON;
        case 0: return ONEOFFIELD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OneofFieldCase
  getOneofFieldCase() {
    return OneofFieldCase.forNumber(
        oneofFieldCase_);
  }

  public static final int ONEOF_STRING_FIELD_NUMBER = 1;
  /**
   * <code>string oneof_string = 1;</code>
   * @return Whether the oneofString field is set.
   */
  public boolean hasOneofString() {
    return oneofFieldCase_ == 1;
  }
  /**
   * <code>string oneof_string = 1;</code>
   * @return The oneofString.
   */
  public java.lang.String getOneofString() {
    java.lang.Object ref = "";
    if (oneofFieldCase_ == 1) {
      ref = oneofField_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (oneofFieldCase_ == 1) {
        oneofField_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string oneof_string = 1;</code>
   * @return The bytes for oneofString.
   */
  public com.google.protobuf.ByteString
      getOneofStringBytes() {
    java.lang.Object ref = "";
    if (oneofFieldCase_ == 1) {
      ref = oneofField_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (oneofFieldCase_ == 1) {
        oneofField_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ONEOF_INT_FIELD_NUMBER = 2;
  /**
   * <code>int32 oneof_int = 2;</code>
   * @return Whether the oneofInt field is set.
   */
  @java.lang.Override
  public boolean hasOneofInt() {
    return oneofFieldCase_ == 2;
  }
  /**
   * <code>int32 oneof_int = 2;</code>
   * @return The oneofInt.
   */
  @java.lang.Override
  public int getOneofInt() {
    if (oneofFieldCase_ == 2) {
      return (java.lang.Integer) oneofField_;
    }
    return 0;
  }

  public static final int ONEOF_PERSON_FIELD_NUMBER = 3;
  /**
   * <code>.com.example.test.Person oneof_person = 3;</code>
   * @return Whether the oneofPerson field is set.
   */
  @java.lang.Override
  public boolean hasOneofPerson() {
    return oneofFieldCase_ == 3;
  }
  /**
   * <code>.com.example.test.Person oneof_person = 3;</code>
   * @return The oneofPerson.
   */
  @java.lang.Override
  public com.github.mscheong01.test.Person getOneofPerson() {
    if (oneofFieldCase_ == 3) {
       return (com.github.mscheong01.test.Person) oneofField_;
    }
    return com.github.mscheong01.test.Person.getDefaultInstance();
  }
  /**
   * <code>.com.example.test.Person oneof_person = 3;</code>
   */
  @java.lang.Override
  public com.github.mscheong01.test.PersonOrBuilder getOneofPersonOrBuilder() {
    if (oneofFieldCase_ == 3) {
       return (com.github.mscheong01.test.Person) oneofField_;
    }
    return com.github.mscheong01.test.Person.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (oneofFieldCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, oneofField_);
    }
    if (oneofFieldCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) oneofField_));
    }
    if (oneofFieldCase_ == 3) {
      output.writeMessage(3, (com.github.mscheong01.test.Person) oneofField_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oneofFieldCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, oneofField_);
    }
    if (oneofFieldCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) oneofField_));
    }
    if (oneofFieldCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.github.mscheong01.test.Person) oneofField_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.mscheong01.test.OneOfMessage)) {
      return super.equals(obj);
    }
    com.github.mscheong01.test.OneOfMessage other = (com.github.mscheong01.test.OneOfMessage) obj;

    if (!getOneofFieldCase().equals(other.getOneofFieldCase())) return false;
    switch (oneofFieldCase_) {
      case 1:
        if (!getOneofString()
            .equals(other.getOneofString())) return false;
        break;
      case 2:
        if (getOneofInt()
            != other.getOneofInt()) return false;
        break;
      case 3:
        if (!getOneofPerson()
            .equals(other.getOneofPerson())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (oneofFieldCase_) {
      case 1:
        hash = (37 * hash) + ONEOF_STRING_FIELD_NUMBER;
        hash = (53 * hash) + getOneofString().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ONEOF_INT_FIELD_NUMBER;
        hash = (53 * hash) + getOneofInt();
        break;
      case 3:
        hash = (37 * hash) + ONEOF_PERSON_FIELD_NUMBER;
        hash = (53 * hash) + getOneofPerson().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.mscheong01.test.OneOfMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.mscheong01.test.OneOfMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.mscheong01.test.OneOfMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.mscheong01.test.OneOfMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.mscheong01.test.OneOfMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.test.OneOfMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.test.OneOfMessage)
      com.github.mscheong01.test.OneOfMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.mscheong01.test.Test.internal_static_com_example_test_OneOfMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.mscheong01.test.Test.internal_static_com_example_test_OneOfMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.mscheong01.test.OneOfMessage.class, com.github.mscheong01.test.OneOfMessage.Builder.class);
    }

    // Construct using com.github.mscheong01.test.OneOfMessage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (oneofPersonBuilder_ != null) {
        oneofPersonBuilder_.clear();
      }
      oneofFieldCase_ = 0;
      oneofField_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.mscheong01.test.Test.internal_static_com_example_test_OneOfMessage_descriptor;
    }

    @java.lang.Override
    public com.github.mscheong01.test.OneOfMessage getDefaultInstanceForType() {
      return com.github.mscheong01.test.OneOfMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.mscheong01.test.OneOfMessage build() {
      com.github.mscheong01.test.OneOfMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.mscheong01.test.OneOfMessage buildPartial() {
      com.github.mscheong01.test.OneOfMessage result = new com.github.mscheong01.test.OneOfMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.mscheong01.test.OneOfMessage result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.github.mscheong01.test.OneOfMessage result) {
      result.oneofFieldCase_ = oneofFieldCase_;
      result.oneofField_ = this.oneofField_;
      if (oneofFieldCase_ == 3 &&
          oneofPersonBuilder_ != null) {
        result.oneofField_ = oneofPersonBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.mscheong01.test.OneOfMessage) {
        return mergeFrom((com.github.mscheong01.test.OneOfMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.mscheong01.test.OneOfMessage other) {
      if (other == com.github.mscheong01.test.OneOfMessage.getDefaultInstance()) return this;
      switch (other.getOneofFieldCase()) {
        case ONEOF_STRING: {
          oneofFieldCase_ = 1;
          oneofField_ = other.oneofField_;
          onChanged();
          break;
        }
        case ONEOF_INT: {
          setOneofInt(other.getOneofInt());
          break;
        }
        case ONEOF_PERSON: {
          mergeOneofPerson(other.getOneofPerson());
          break;
        }
        case ONEOFFIELD_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              oneofFieldCase_ = 1;
              oneofField_ = s;
              break;
            } // case 10
            case 16: {
              oneofField_ = input.readInt32();
              oneofFieldCase_ = 2;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getOneofPersonFieldBuilder().getBuilder(),
                  extensionRegistry);
              oneofFieldCase_ = 3;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int oneofFieldCase_ = 0;
    private java.lang.Object oneofField_;
    public OneofFieldCase
        getOneofFieldCase() {
      return OneofFieldCase.forNumber(
          oneofFieldCase_);
    }

    public Builder clearOneofField() {
      oneofFieldCase_ = 0;
      oneofField_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string oneof_string = 1;</code>
     * @return Whether the oneofString field is set.
     */
    @java.lang.Override
    public boolean hasOneofString() {
      return oneofFieldCase_ == 1;
    }
    /**
     * <code>string oneof_string = 1;</code>
     * @return The oneofString.
     */
    @java.lang.Override
    public java.lang.String getOneofString() {
      java.lang.Object ref = "";
      if (oneofFieldCase_ == 1) {
        ref = oneofField_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (oneofFieldCase_ == 1) {
          oneofField_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string oneof_string = 1;</code>
     * @return The bytes for oneofString.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOneofStringBytes() {
      java.lang.Object ref = "";
      if (oneofFieldCase_ == 1) {
        ref = oneofField_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (oneofFieldCase_ == 1) {
          oneofField_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string oneof_string = 1;</code>
     * @param value The oneofString to set.
     * @return This builder for chaining.
     */
    public Builder setOneofString(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oneofFieldCase_ = 1;
      oneofField_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string oneof_string = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOneofString() {
      if (oneofFieldCase_ == 1) {
        oneofFieldCase_ = 0;
        oneofField_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string oneof_string = 1;</code>
     * @param value The bytes for oneofString to set.
     * @return This builder for chaining.
     */
    public Builder setOneofStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oneofFieldCase_ = 1;
      oneofField_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 oneof_int = 2;</code>
     * @return Whether the oneofInt field is set.
     */
    public boolean hasOneofInt() {
      return oneofFieldCase_ == 2;
    }
    /**
     * <code>int32 oneof_int = 2;</code>
     * @return The oneofInt.
     */
    public int getOneofInt() {
      if (oneofFieldCase_ == 2) {
        return (java.lang.Integer) oneofField_;
      }
      return 0;
    }
    /**
     * <code>int32 oneof_int = 2;</code>
     * @param value The oneofInt to set.
     * @return This builder for chaining.
     */
    public Builder setOneofInt(int value) {

      oneofFieldCase_ = 2;
      oneofField_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 oneof_int = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOneofInt() {
      if (oneofFieldCase_ == 2) {
        oneofFieldCase_ = 0;
        oneofField_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.mscheong01.test.Person, com.github.mscheong01.test.Person.Builder, com.github.mscheong01.test.PersonOrBuilder> oneofPersonBuilder_;
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     * @return Whether the oneofPerson field is set.
     */
    @java.lang.Override
    public boolean hasOneofPerson() {
      return oneofFieldCase_ == 3;
    }
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     * @return The oneofPerson.
     */
    @java.lang.Override
    public com.github.mscheong01.test.Person getOneofPerson() {
      if (oneofPersonBuilder_ == null) {
        if (oneofFieldCase_ == 3) {
          return (com.github.mscheong01.test.Person) oneofField_;
        }
        return com.github.mscheong01.test.Person.getDefaultInstance();
      } else {
        if (oneofFieldCase_ == 3) {
          return oneofPersonBuilder_.getMessage();
        }
        return com.github.mscheong01.test.Person.getDefaultInstance();
      }
    }
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     */
    public Builder setOneofPerson(com.github.mscheong01.test.Person value) {
      if (oneofPersonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneofField_ = value;
        onChanged();
      } else {
        oneofPersonBuilder_.setMessage(value);
      }
      oneofFieldCase_ = 3;
      return this;
    }
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     */
    public Builder setOneofPerson(
        com.github.mscheong01.test.Person.Builder builderForValue) {
      if (oneofPersonBuilder_ == null) {
        oneofField_ = builderForValue.build();
        onChanged();
      } else {
        oneofPersonBuilder_.setMessage(builderForValue.build());
      }
      oneofFieldCase_ = 3;
      return this;
    }
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     */
    public Builder mergeOneofPerson(com.github.mscheong01.test.Person value) {
      if (oneofPersonBuilder_ == null) {
        if (oneofFieldCase_ == 3 &&
            oneofField_ != com.github.mscheong01.test.Person.getDefaultInstance()) {
          oneofField_ = com.github.mscheong01.test.Person.newBuilder((com.github.mscheong01.test.Person) oneofField_)
              .mergeFrom(value).buildPartial();
        } else {
          oneofField_ = value;
        }
        onChanged();
      } else {
        if (oneofFieldCase_ == 3) {
          oneofPersonBuilder_.mergeFrom(value);
        } else {
          oneofPersonBuilder_.setMessage(value);
        }
      }
      oneofFieldCase_ = 3;
      return this;
    }
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     */
    public Builder clearOneofPerson() {
      if (oneofPersonBuilder_ == null) {
        if (oneofFieldCase_ == 3) {
          oneofFieldCase_ = 0;
          oneofField_ = null;
          onChanged();
        }
      } else {
        if (oneofFieldCase_ == 3) {
          oneofFieldCase_ = 0;
          oneofField_ = null;
        }
        oneofPersonBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     */
    public com.github.mscheong01.test.Person.Builder getOneofPersonBuilder() {
      return getOneofPersonFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     */
    @java.lang.Override
    public com.github.mscheong01.test.PersonOrBuilder getOneofPersonOrBuilder() {
      if ((oneofFieldCase_ == 3) && (oneofPersonBuilder_ != null)) {
        return oneofPersonBuilder_.getMessageOrBuilder();
      } else {
        if (oneofFieldCase_ == 3) {
          return (com.github.mscheong01.test.Person) oneofField_;
        }
        return com.github.mscheong01.test.Person.getDefaultInstance();
      }
    }
    /**
     * <code>.com.example.test.Person oneof_person = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.mscheong01.test.Person, com.github.mscheong01.test.Person.Builder, com.github.mscheong01.test.PersonOrBuilder> 
        getOneofPersonFieldBuilder() {
      if (oneofPersonBuilder_ == null) {
        if (!(oneofFieldCase_ == 3)) {
          oneofField_ = com.github.mscheong01.test.Person.getDefaultInstance();
        }
        oneofPersonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.mscheong01.test.Person, com.github.mscheong01.test.Person.Builder, com.github.mscheong01.test.PersonOrBuilder>(
                (com.github.mscheong01.test.Person) oneofField_,
                getParentForChildren(),
                isClean());
        oneofField_ = null;
      }
      oneofFieldCase_ = 3;
      onChanged();
      return oneofPersonBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.test.OneOfMessage)
  }

  // @@protoc_insertion_point(class_scope:com.example.test.OneOfMessage)
  private static final com.github.mscheong01.test.OneOfMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.mscheong01.test.OneOfMessage();
  }

  public static com.github.mscheong01.test.OneOfMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OneOfMessage>
      PARSER = new com.google.protobuf.AbstractParser<OneOfMessage>() {
    @java.lang.Override
    public OneOfMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<OneOfMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OneOfMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.mscheong01.test.OneOfMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
