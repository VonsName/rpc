// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtoBufMRpcResponse.proto

package com.von.rpc.common.entity;

public final class MRpcProtoBufResponse {
  private MRpcProtoBufResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ProtoBufMRpcResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string requestId = 1;
    /**
     * <code>required string requestId = 1;</code>
     *
     * <pre>
     *请求id
     * </pre>
     */
    boolean hasRequestId();
    /**
     * <code>required string requestId = 1;</code>
     *
     * <pre>
     *请求id
     * </pre>
     */
    java.lang.String getRequestId();
    /**
     * <code>required string requestId = 1;</code>
     *
     * <pre>
     *请求id
     * </pre>
     */
    com.google.protobuf.ByteString
        getRequestIdBytes();

    // required string result = 2;
    /**
     * <code>required string result = 2;</code>
     *
     * <pre>
     *返回结果
     * </pre>
     */
    boolean hasResult();
    /**
     * <code>required string result = 2;</code>
     *
     * <pre>
     *返回结果
     * </pre>
     */
    java.lang.String getResult();
    /**
     * <code>required string result = 2;</code>
     *
     * <pre>
     *返回结果
     * </pre>
     */
    com.google.protobuf.ByteString
        getResultBytes();

    // required string exception = 3;
    /**
     * <code>required string exception = 3;</code>
     *
     * <pre>
     *异常信息
     * </pre>
     */
    boolean hasException();
    /**
     * <code>required string exception = 3;</code>
     *
     * <pre>
     *异常信息
     * </pre>
     */
    java.lang.String getException();
    /**
     * <code>required string exception = 3;</code>
     *
     * <pre>
     *异常信息
     * </pre>
     */
    com.google.protobuf.ByteString
        getExceptionBytes();

    // required string exceptionClass = 4;
    /**
     * <code>required string exceptionClass = 4;</code>
     *
     * <pre>
     *异常class
     * </pre>
     */
    boolean hasExceptionClass();
    /**
     * <code>required string exceptionClass = 4;</code>
     *
     * <pre>
     *异常class
     * </pre>
     */
    java.lang.String getExceptionClass();
    /**
     * <code>required string exceptionClass = 4;</code>
     *
     * <pre>
     *异常class
     * </pre>
     */
    com.google.protobuf.ByteString
        getExceptionClassBytes();
  }
  /**
   * Protobuf type {@code com.von.rpc.common.netty.proto.ProtoBufMRpcResponse}
   */
  public static final class ProtoBufMRpcResponse extends
      com.google.protobuf.GeneratedMessage
      implements ProtoBufMRpcResponseOrBuilder {
    // Use ProtoBufMRpcResponse.newBuilder() to construct.
    private ProtoBufMRpcResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ProtoBufMRpcResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ProtoBufMRpcResponse defaultInstance;
    public static ProtoBufMRpcResponse getDefaultInstance() {
      return defaultInstance;
    }

    public ProtoBufMRpcResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ProtoBufMRpcResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              requestId_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              result_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              exception_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              exceptionClass_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.von.rpc.common.entity.MRpcProtoBufResponse.internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.von.rpc.common.entity.MRpcProtoBufResponse.internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse.class, com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<ProtoBufMRpcResponse> PARSER =
        new com.google.protobuf.AbstractParser<ProtoBufMRpcResponse>() {
      public ProtoBufMRpcResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProtoBufMRpcResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ProtoBufMRpcResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string requestId = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private java.lang.Object requestId_;
    /**
     * <code>required string requestId = 1;</code>
     *
     * <pre>
     *请求id
     * </pre>
     */
    public boolean hasRequestId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string requestId = 1;</code>
     *
     * <pre>
     *请求id
     * </pre>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          requestId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string requestId = 1;</code>
     *
     * <pre>
     *请求id
     * </pre>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string result = 2;
    public static final int RESULT_FIELD_NUMBER = 2;
    private java.lang.Object result_;
    /**
     * <code>required string result = 2;</code>
     *
     * <pre>
     *返回结果
     * </pre>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string result = 2;</code>
     *
     * <pre>
     *返回结果
     * </pre>
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          result_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string result = 2;</code>
     *
     * <pre>
     *返回结果
     * </pre>
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string exception = 3;
    public static final int EXCEPTION_FIELD_NUMBER = 3;
    private java.lang.Object exception_;
    /**
     * <code>required string exception = 3;</code>
     *
     * <pre>
     *异常信息
     * </pre>
     */
    public boolean hasException() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string exception = 3;</code>
     *
     * <pre>
     *异常信息
     * </pre>
     */
    public java.lang.String getException() {
      java.lang.Object ref = exception_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          exception_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string exception = 3;</code>
     *
     * <pre>
     *异常信息
     * </pre>
     */
    public com.google.protobuf.ByteString
        getExceptionBytes() {
      java.lang.Object ref = exception_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exception_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string exceptionClass = 4;
    public static final int EXCEPTIONCLASS_FIELD_NUMBER = 4;
    private java.lang.Object exceptionClass_;
    /**
     * <code>required string exceptionClass = 4;</code>
     *
     * <pre>
     *异常class
     * </pre>
     */
    public boolean hasExceptionClass() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string exceptionClass = 4;</code>
     *
     * <pre>
     *异常class
     * </pre>
     */
    public java.lang.String getExceptionClass() {
      java.lang.Object ref = exceptionClass_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          exceptionClass_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string exceptionClass = 4;</code>
     *
     * <pre>
     *异常class
     * </pre>
     */
    public com.google.protobuf.ByteString
        getExceptionClassBytes() {
      java.lang.Object ref = exceptionClass_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exceptionClass_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      requestId_ = "";
      result_ = "";
      exception_ = "";
      exceptionClass_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasRequestId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResult()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasException()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasExceptionClass()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getRequestIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getResultBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getExceptionBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getExceptionClassBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getRequestIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getResultBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getExceptionBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getExceptionClassBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.von.rpc.common.netty.proto.ProtoBufMRpcResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.von.rpc.common.entity.MRpcProtoBufResponse.internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.von.rpc.common.entity.MRpcProtoBufResponse.internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse.class, com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse.Builder.class);
      }

      // Construct using com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        requestId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        exception_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        exceptionClass_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.von.rpc.common.entity.MRpcProtoBufResponse.internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_descriptor;
      }

      public com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse getDefaultInstanceForType() {
        return com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse.getDefaultInstance();
      }

      public com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse build() {
        com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse buildPartial() {
        com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse result = new com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.requestId_ = requestId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.result_ = result_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.exception_ = exception_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.exceptionClass_ = exceptionClass_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse) {
          return mergeFrom((com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse other) {
        if (other == com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          bitField0_ |= 0x00000001;
          requestId_ = other.requestId_;
          onChanged();
        }
        if (other.hasResult()) {
          bitField0_ |= 0x00000002;
          result_ = other.result_;
          onChanged();
        }
        if (other.hasException()) {
          bitField0_ |= 0x00000004;
          exception_ = other.exception_;
          onChanged();
        }
        if (other.hasExceptionClass()) {
          bitField0_ |= 0x00000008;
          exceptionClass_ = other.exceptionClass_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRequestId()) {
          
          return false;
        }
        if (!hasResult()) {
          
          return false;
        }
        if (!hasException()) {
          
          return false;
        }
        if (!hasExceptionClass()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.von.rpc.common.entity.MRpcProtoBufResponse.ProtoBufMRpcResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string requestId = 1;
      private java.lang.Object requestId_ = "";
      /**
       * <code>required string requestId = 1;</code>
       *
       * <pre>
       *请求id
       * </pre>
       */
      public boolean hasRequestId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string requestId = 1;</code>
       *
       * <pre>
       *请求id
       * </pre>
       */
      public java.lang.String getRequestId() {
        java.lang.Object ref = requestId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          requestId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string requestId = 1;</code>
       *
       * <pre>
       *请求id
       * </pre>
       */
      public com.google.protobuf.ByteString
          getRequestIdBytes() {
        java.lang.Object ref = requestId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          requestId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string requestId = 1;</code>
       *
       * <pre>
       *请求id
       * </pre>
       */
      public Builder setRequestId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string requestId = 1;</code>
       *
       * <pre>
       *请求id
       * </pre>
       */
      public Builder clearRequestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        requestId_ = getDefaultInstance().getRequestId();
        onChanged();
        return this;
      }
      /**
       * <code>required string requestId = 1;</code>
       *
       * <pre>
       *请求id
       * </pre>
       */
      public Builder setRequestIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        requestId_ = value;
        onChanged();
        return this;
      }

      // required string result = 2;
      private java.lang.Object result_ = "";
      /**
       * <code>required string result = 2;</code>
       *
       * <pre>
       *返回结果
       * </pre>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string result = 2;</code>
       *
       * <pre>
       *返回结果
       * </pre>
       */
      public java.lang.String getResult() {
        java.lang.Object ref = result_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          result_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string result = 2;</code>
       *
       * <pre>
       *返回结果
       * </pre>
       */
      public com.google.protobuf.ByteString
          getResultBytes() {
        java.lang.Object ref = result_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          result_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string result = 2;</code>
       *
       * <pre>
       *返回结果
       * </pre>
       */
      public Builder setResult(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string result = 2;</code>
       *
       * <pre>
       *返回结果
       * </pre>
       */
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000002);
        result_ = getDefaultInstance().getResult();
        onChanged();
        return this;
      }
      /**
       * <code>required string result = 2;</code>
       *
       * <pre>
       *返回结果
       * </pre>
       */
      public Builder setResultBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        result_ = value;
        onChanged();
        return this;
      }

      // required string exception = 3;
      private java.lang.Object exception_ = "";
      /**
       * <code>required string exception = 3;</code>
       *
       * <pre>
       *异常信息
       * </pre>
       */
      public boolean hasException() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string exception = 3;</code>
       *
       * <pre>
       *异常信息
       * </pre>
       */
      public java.lang.String getException() {
        java.lang.Object ref = exception_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          exception_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string exception = 3;</code>
       *
       * <pre>
       *异常信息
       * </pre>
       */
      public com.google.protobuf.ByteString
          getExceptionBytes() {
        java.lang.Object ref = exception_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          exception_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string exception = 3;</code>
       *
       * <pre>
       *异常信息
       * </pre>
       */
      public Builder setException(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        exception_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string exception = 3;</code>
       *
       * <pre>
       *异常信息
       * </pre>
       */
      public Builder clearException() {
        bitField0_ = (bitField0_ & ~0x00000004);
        exception_ = getDefaultInstance().getException();
        onChanged();
        return this;
      }
      /**
       * <code>required string exception = 3;</code>
       *
       * <pre>
       *异常信息
       * </pre>
       */
      public Builder setExceptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        exception_ = value;
        onChanged();
        return this;
      }

      // required string exceptionClass = 4;
      private java.lang.Object exceptionClass_ = "";
      /**
       * <code>required string exceptionClass = 4;</code>
       *
       * <pre>
       *异常class
       * </pre>
       */
      public boolean hasExceptionClass() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string exceptionClass = 4;</code>
       *
       * <pre>
       *异常class
       * </pre>
       */
      public java.lang.String getExceptionClass() {
        java.lang.Object ref = exceptionClass_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          exceptionClass_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string exceptionClass = 4;</code>
       *
       * <pre>
       *异常class
       * </pre>
       */
      public com.google.protobuf.ByteString
          getExceptionClassBytes() {
        java.lang.Object ref = exceptionClass_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          exceptionClass_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string exceptionClass = 4;</code>
       *
       * <pre>
       *异常class
       * </pre>
       */
      public Builder setExceptionClass(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        exceptionClass_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string exceptionClass = 4;</code>
       *
       * <pre>
       *异常class
       * </pre>
       */
      public Builder clearExceptionClass() {
        bitField0_ = (bitField0_ & ~0x00000008);
        exceptionClass_ = getDefaultInstance().getExceptionClass();
        onChanged();
        return this;
      }
      /**
       * <code>required string exceptionClass = 4;</code>
       *
       * <pre>
       *异常class
       * </pre>
       */
      public Builder setExceptionClassBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        exceptionClass_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.von.rpc.common.netty.proto.ProtoBufMRpcResponse)
    }

    static {
      defaultInstance = new ProtoBufMRpcResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.von.rpc.common.netty.proto.ProtoBufMRpcResponse)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ProtoBufMRpcResponse.proto\022\036com.von.rp" +
      "c.common.netty.proto\"d\n\024ProtoBufMRpcResp" +
      "onse\022\021\n\trequestId\030\001 \002(\t\022\016\n\006result\030\002 \002(\t\022" +
      "\021\n\texception\030\003 \002(\t\022\026\n\016exceptionClass\030\004 \002" +
      "(\tB1\n\031com.von.rpc.common.entityB\024MRpcPro" +
      "toBufResponse"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_von_rpc_common_netty_proto_ProtoBufMRpcResponse_descriptor,
              new java.lang.String[] { "RequestId", "Result", "Exception", "ExceptionClass", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
