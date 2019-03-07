// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/protobuf/Repeated.proto

package com.hongguo.netty.proto.repeated;

public final class RepeatedMessage {
  private RepeatedMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RepeatedObjectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:repeated.RepeatedObject)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional int32 age = 2;</code>
     */
    boolean hasAge();
    /**
     * <code>optional int32 age = 2;</code>
     */
    int getAge();

    /**
     * <code>repeated string hobbies = 3;</code>
     */
    java.util.List<java.lang.String>
        getHobbiesList();
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    int getHobbiesCount();
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    java.lang.String getHobbies(int index);
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    com.google.protobuf.ByteString
        getHobbiesBytes(int index);
  }
  /**
   * Protobuf type {@code repeated.RepeatedObject}
   */
  public  static final class RepeatedObject extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:repeated.RepeatedObject)
      RepeatedObjectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RepeatedObject.newBuilder() to construct.
    private RepeatedObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RepeatedObject() {
      name_ = "";
      hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RepeatedObject(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              age_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                hobbies_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              hobbies_.add(bs);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) != 0)) {
          hobbies_ = hobbies_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hongguo.netty.proto.repeated.RepeatedMessage.internal_static_repeated_RepeatedObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hongguo.netty.proto.repeated.RepeatedMessage.internal_static_repeated_RepeatedObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject.class, com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>optional int32 age = 2;</code>
     */
    public boolean hasAge() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 age = 2;</code>
     */
    public int getAge() {
      return age_;
    }

    public static final int HOBBIES_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList hobbies_;
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getHobbiesList() {
      return hobbies_;
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public int getHobbiesCount() {
      return hobbies_.size();
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public java.lang.String getHobbies(int index) {
      return hobbies_.get(index);
    }
    /**
     * <code>repeated string hobbies = 3;</code>
     */
    public com.google.protobuf.ByteString
        getHobbiesBytes(int index) {
      return hobbies_.getByteString(index);
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
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, age_);
      }
      for (int i = 0; i < hobbies_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hobbies_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < hobbies_.size(); i++) {
          dataSize += computeStringSizeNoTag(hobbies_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getHobbiesList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject)) {
        return super.equals(obj);
      }
      com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject other = (com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasAge() != other.hasAge()) return false;
      if (hasAge()) {
        if (getAge()
            != other.getAge()) return false;
      }
      if (!getHobbiesList()
          .equals(other.getHobbiesList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasAge()) {
        hash = (37 * hash) + AGE_FIELD_NUMBER;
        hash = (53 * hash) + getAge();
      }
      if (getHobbiesCount() > 0) {
        hash = (37 * hash) + HOBBIES_FIELD_NUMBER;
        hash = (53 * hash) + getHobbiesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parseFrom(
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
    public static Builder newBuilder(com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject prototype) {
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
     * Protobuf type {@code repeated.RepeatedObject}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:repeated.RepeatedObject)
        com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObjectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hongguo.netty.proto.repeated.RepeatedMessage.internal_static_repeated_RepeatedObject_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hongguo.netty.proto.repeated.RepeatedMessage.internal_static_repeated_RepeatedObject_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject.class, com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject.Builder.class);
      }

      // Construct using com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hongguo.netty.proto.repeated.RepeatedMessage.internal_static_repeated_RepeatedObject_descriptor;
      }

      @java.lang.Override
      public com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject getDefaultInstanceForType() {
        return com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject.getDefaultInstance();
      }

      @java.lang.Override
      public com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject build() {
        com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject buildPartial() {
        com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject result = new com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.age_ = age_;
          to_bitField0_ |= 0x00000002;
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          hobbies_ = hobbies_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.hobbies_ = hobbies_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject) {
          return mergeFrom((com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject other) {
        if (other == com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        if (!other.hobbies_.isEmpty()) {
          if (hobbies_.isEmpty()) {
            hobbies_ = other.hobbies_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureHobbiesIsMutable();
            hobbies_.addAll(other.hobbies_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
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
        com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>optional int32 age = 2;</code>
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000002;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 age = 2;</code>
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureHobbiesIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          hobbies_ = new com.google.protobuf.LazyStringArrayList(hobbies_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getHobbiesList() {
        return hobbies_.getUnmodifiableView();
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public int getHobbiesCount() {
        return hobbies_.size();
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public java.lang.String getHobbies(int index) {
        return hobbies_.get(index);
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public com.google.protobuf.ByteString
          getHobbiesBytes(int index) {
        return hobbies_.getByteString(index);
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public Builder setHobbies(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHobbiesIsMutable();
        hobbies_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public Builder addHobbies(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHobbiesIsMutable();
        hobbies_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public Builder addAllHobbies(
          java.lang.Iterable<java.lang.String> values) {
        ensureHobbiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hobbies_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public Builder clearHobbies() {
        hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string hobbies = 3;</code>
       */
      public Builder addHobbiesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHobbiesIsMutable();
        hobbies_.add(value);
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:repeated.RepeatedObject)
    }

    // @@protoc_insertion_point(class_scope:repeated.RepeatedObject)
    private static final com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject();
    }

    public static com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<RepeatedObject>
        PARSER = new com.google.protobuf.AbstractParser<RepeatedObject>() {
      @java.lang.Override
      public RepeatedObject parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RepeatedObject(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RepeatedObject> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RepeatedObject> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.hongguo.netty.proto.repeated.RepeatedMessage.RepeatedObject getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_repeated_RepeatedObject_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_repeated_RepeatedObject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033src/protobuf/Repeated.proto\022\010repeated\"" +
      "<\n\016RepeatedObject\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002" +
      " \001(\005\022\017\n\007hobbies\030\003 \003(\tB3\n com.hongguo.net" +
      "ty.proto.repeatedB\017RepeatedMessage"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_repeated_RepeatedObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_repeated_RepeatedObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_repeated_RepeatedObject_descriptor,
        new java.lang.String[] { "Name", "Age", "Hobbies", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
