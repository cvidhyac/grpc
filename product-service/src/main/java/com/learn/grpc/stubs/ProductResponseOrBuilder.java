// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.learn.grpc.stubs;

public interface ProductResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProductResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Product product = 1;</code>
   */
  java.util.List<com.learn.grpc.stubs.Product> 
      getProductList();
  /**
   * <code>repeated .Product product = 1;</code>
   */
  com.learn.grpc.stubs.Product getProduct(int index);
  /**
   * <code>repeated .Product product = 1;</code>
   */
  int getProductCount();
  /**
   * <code>repeated .Product product = 1;</code>
   */
  java.util.List<? extends com.learn.grpc.stubs.ProductOrBuilder> 
      getProductOrBuilderList();
  /**
   * <code>repeated .Product product = 1;</code>
   */
  com.learn.grpc.stubs.ProductOrBuilder getProductOrBuilder(
      int index);
}