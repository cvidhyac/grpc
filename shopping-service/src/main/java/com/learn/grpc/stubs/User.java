// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.learn.grpc.stubs;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_learn_grpc_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_learn_grpc_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_learn_grpc_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_learn_grpc_UserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\016com.learn.grpc\"+\n\013UserRequ" +
      "est\022\020\n\010userName\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\"\211\001\n\014Us" +
      "erResponse\022\n\n\002id\030\001 \001(\005\022\020\n\010userName\030\002 \001(\t" +
      "\022\014\n\004name\030\003 \001(\t\022\013\n\003age\030\004 \001(\005\022&\n\006gender\030\005 " +
      "\001(\0162\026.com.learn.grpc.Gender\022\030\n\020number_of" +
      "_orders\030\006 \001(\005*)\n\006Gender\022\010\n\004MALE\020\000\022\n\n\006FEM" +
      "ALE\020\001\022\t\n\005OTHER\020\0022Z\n\013UserService\022K\n\016getUs" +
      "erDetails\022\033.com.learn.grpc.UserRequest\032\034" +
      ".com.learn.grpc.UserResponseB\030\n\024com.lear" +
      "n.grpc.stubsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_learn_grpc_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_learn_grpc_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_learn_grpc_UserRequest_descriptor,
        new java.lang.String[] { "UserName", "Id", });
    internal_static_com_learn_grpc_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_learn_grpc_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_learn_grpc_UserResponse_descriptor,
        new java.lang.String[] { "Id", "UserName", "Name", "Age", "Gender", "NumberOfOrders", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
