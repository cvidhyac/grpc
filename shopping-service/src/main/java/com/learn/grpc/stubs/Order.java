// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.learn.grpc.stubs;

/**
 * Protobuf type {@code com.learn.grpc.Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.learn.grpc.Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Order();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Order(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            userId_ = input.readInt32();
            break;
          }
          case 16: {

            orderId_ = input.readInt32();
            break;
          }
          case 24: {

            noOfItems_ = input.readInt32();
            break;
          }
          case 33: {

            totalAmount_ = input.readDouble();
            break;
          }
          case 42: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (orderDate_ != null) {
              subBuilder = orderDate_.toBuilder();
            }
            orderDate_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(orderDate_);
              orderDate_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.learn.grpc.stubs.OrderOuterClass.internal_static_com_learn_grpc_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.learn.grpc.stubs.OrderOuterClass.internal_static_com_learn_grpc_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.learn.grpc.stubs.Order.class, com.learn.grpc.stubs.Order.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private int userId_;
  /**
   * <code>int32 user_id = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  public static final int ORDER_ID_FIELD_NUMBER = 2;
  private int orderId_;
  /**
   * <code>int32 order_id = 2;</code>
   * @return The orderId.
   */
  @java.lang.Override
  public int getOrderId() {
    return orderId_;
  }

  public static final int NO_OF_ITEMS_FIELD_NUMBER = 3;
  private int noOfItems_;
  /**
   * <code>int32 no_of_items = 3;</code>
   * @return The noOfItems.
   */
  @java.lang.Override
  public int getNoOfItems() {
    return noOfItems_;
  }

  public static final int TOTAL_AMOUNT_FIELD_NUMBER = 4;
  private double totalAmount_;
  /**
   * <code>double total_amount = 4;</code>
   * @return The totalAmount.
   */
  @java.lang.Override
  public double getTotalAmount() {
    return totalAmount_;
  }

  public static final int ORDER_DATE_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp orderDate_;
  /**
   * <code>.google.protobuf.Timestamp order_date = 5;</code>
   * @return Whether the orderDate field is set.
   */
  @java.lang.Override
  public boolean hasOrderDate() {
    return orderDate_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp order_date = 5;</code>
   * @return The orderDate.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getOrderDate() {
    return orderDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : orderDate_;
  }
  /**
   * <code>.google.protobuf.Timestamp order_date = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getOrderDateOrBuilder() {
    return getOrderDate();
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
    if (userId_ != 0) {
      output.writeInt32(1, userId_);
    }
    if (orderId_ != 0) {
      output.writeInt32(2, orderId_);
    }
    if (noOfItems_ != 0) {
      output.writeInt32(3, noOfItems_);
    }
    if (totalAmount_ != 0D) {
      output.writeDouble(4, totalAmount_);
    }
    if (orderDate_ != null) {
      output.writeMessage(5, getOrderDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, userId_);
    }
    if (orderId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, orderId_);
    }
    if (noOfItems_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, noOfItems_);
    }
    if (totalAmount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, totalAmount_);
    }
    if (orderDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getOrderDate());
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
    if (!(obj instanceof com.learn.grpc.stubs.Order)) {
      return super.equals(obj);
    }
    com.learn.grpc.stubs.Order other = (com.learn.grpc.stubs.Order) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getOrderId()
        != other.getOrderId()) return false;
    if (getNoOfItems()
        != other.getNoOfItems()) return false;
    if (java.lang.Double.doubleToLongBits(getTotalAmount())
        != java.lang.Double.doubleToLongBits(
            other.getTotalAmount())) return false;
    if (hasOrderDate() != other.hasOrderDate()) return false;
    if (hasOrderDate()) {
      if (!getOrderDate()
          .equals(other.getOrderDate())) return false;
    }
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + ORDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId();
    hash = (37 * hash) + NO_OF_ITEMS_FIELD_NUMBER;
    hash = (53 * hash) + getNoOfItems();
    hash = (37 * hash) + TOTAL_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTotalAmount()));
    if (hasOrderDate()) {
      hash = (37 * hash) + ORDER_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getOrderDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.learn.grpc.stubs.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learn.grpc.stubs.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learn.grpc.stubs.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learn.grpc.stubs.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learn.grpc.stubs.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learn.grpc.stubs.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learn.grpc.stubs.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.learn.grpc.stubs.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.learn.grpc.stubs.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.learn.grpc.stubs.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.learn.grpc.stubs.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.learn.grpc.stubs.Order parseFrom(
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
  public static Builder newBuilder(com.learn.grpc.stubs.Order prototype) {
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
   * Protobuf type {@code com.learn.grpc.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.learn.grpc.Order)
      com.learn.grpc.stubs.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.learn.grpc.stubs.OrderOuterClass.internal_static_com_learn_grpc_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.learn.grpc.stubs.OrderOuterClass.internal_static_com_learn_grpc_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.learn.grpc.stubs.Order.class, com.learn.grpc.stubs.Order.Builder.class);
    }

    // Construct using com.learn.grpc.stubs.Order.newBuilder()
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
      userId_ = 0;

      orderId_ = 0;

      noOfItems_ = 0;

      totalAmount_ = 0D;

      if (orderDateBuilder_ == null) {
        orderDate_ = null;
      } else {
        orderDate_ = null;
        orderDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.learn.grpc.stubs.OrderOuterClass.internal_static_com_learn_grpc_Order_descriptor;
    }

    @java.lang.Override
    public com.learn.grpc.stubs.Order getDefaultInstanceForType() {
      return com.learn.grpc.stubs.Order.getDefaultInstance();
    }

    @java.lang.Override
    public com.learn.grpc.stubs.Order build() {
      com.learn.grpc.stubs.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.learn.grpc.stubs.Order buildPartial() {
      com.learn.grpc.stubs.Order result = new com.learn.grpc.stubs.Order(this);
      result.userId_ = userId_;
      result.orderId_ = orderId_;
      result.noOfItems_ = noOfItems_;
      result.totalAmount_ = totalAmount_;
      if (orderDateBuilder_ == null) {
        result.orderDate_ = orderDate_;
      } else {
        result.orderDate_ = orderDateBuilder_.build();
      }
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
      if (other instanceof com.learn.grpc.stubs.Order) {
        return mergeFrom((com.learn.grpc.stubs.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.learn.grpc.stubs.Order other) {
      if (other == com.learn.grpc.stubs.Order.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getOrderId() != 0) {
        setOrderId(other.getOrderId());
      }
      if (other.getNoOfItems() != 0) {
        setNoOfItems(other.getNoOfItems());
      }
      if (other.getTotalAmount() != 0D) {
        setTotalAmount(other.getTotalAmount());
      }
      if (other.hasOrderDate()) {
        mergeOrderDate(other.getOrderDate());
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
      com.learn.grpc.stubs.Order parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.learn.grpc.stubs.Order) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 user_id = 1;</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0;
      onChanged();
      return this;
    }

    private int orderId_ ;
    /**
     * <code>int32 order_id = 2;</code>
     * @return The orderId.
     */
    @java.lang.Override
    public int getOrderId() {
      return orderId_;
    }
    /**
     * <code>int32 order_id = 2;</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(int value) {
      
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 order_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      
      orderId_ = 0;
      onChanged();
      return this;
    }

    private int noOfItems_ ;
    /**
     * <code>int32 no_of_items = 3;</code>
     * @return The noOfItems.
     */
    @java.lang.Override
    public int getNoOfItems() {
      return noOfItems_;
    }
    /**
     * <code>int32 no_of_items = 3;</code>
     * @param value The noOfItems to set.
     * @return This builder for chaining.
     */
    public Builder setNoOfItems(int value) {
      
      noOfItems_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 no_of_items = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNoOfItems() {
      
      noOfItems_ = 0;
      onChanged();
      return this;
    }

    private double totalAmount_ ;
    /**
     * <code>double total_amount = 4;</code>
     * @return The totalAmount.
     */
    @java.lang.Override
    public double getTotalAmount() {
      return totalAmount_;
    }
    /**
     * <code>double total_amount = 4;</code>
     * @param value The totalAmount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalAmount(double value) {
      
      totalAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double total_amount = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalAmount() {
      
      totalAmount_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp orderDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> orderDateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     * @return Whether the orderDate field is set.
     */
    public boolean hasOrderDate() {
      return orderDateBuilder_ != null || orderDate_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     * @return The orderDate.
     */
    public com.google.protobuf.Timestamp getOrderDate() {
      if (orderDateBuilder_ == null) {
        return orderDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : orderDate_;
      } else {
        return orderDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     */
    public Builder setOrderDate(com.google.protobuf.Timestamp value) {
      if (orderDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        orderDate_ = value;
        onChanged();
      } else {
        orderDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     */
    public Builder setOrderDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (orderDateBuilder_ == null) {
        orderDate_ = builderForValue.build();
        onChanged();
      } else {
        orderDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     */
    public Builder mergeOrderDate(com.google.protobuf.Timestamp value) {
      if (orderDateBuilder_ == null) {
        if (orderDate_ != null) {
          orderDate_ =
            com.google.protobuf.Timestamp.newBuilder(orderDate_).mergeFrom(value).buildPartial();
        } else {
          orderDate_ = value;
        }
        onChanged();
      } else {
        orderDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     */
    public Builder clearOrderDate() {
      if (orderDateBuilder_ == null) {
        orderDate_ = null;
        onChanged();
      } else {
        orderDate_ = null;
        orderDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     */
    public com.google.protobuf.Timestamp.Builder getOrderDateBuilder() {
      
      onChanged();
      return getOrderDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getOrderDateOrBuilder() {
      if (orderDateBuilder_ != null) {
        return orderDateBuilder_.getMessageOrBuilder();
      } else {
        return orderDate_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : orderDate_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp order_date = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getOrderDateFieldBuilder() {
      if (orderDateBuilder_ == null) {
        orderDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getOrderDate(),
                getParentForChildren(),
                isClean());
        orderDate_ = null;
      }
      return orderDateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.learn.grpc.Order)
  }

  // @@protoc_insertion_point(class_scope:com.learn.grpc.Order)
  private static final com.learn.grpc.stubs.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.learn.grpc.stubs.Order();
  }

  public static com.learn.grpc.stubs.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Order(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.learn.grpc.stubs.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

