package com.learn.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: add_to_cart.proto")
public final class AddToCartServiceGrpc {

  private AddToCartServiceGrpc() {}

  public static final String SERVICE_NAME = "AddToCartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.learn.grpc.stubs.AddToCartRequest,
      com.learn.grpc.stubs.AddToCartResponse> getAddToCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addToCart",
      requestType = com.learn.grpc.stubs.AddToCartRequest.class,
      responseType = com.learn.grpc.stubs.AddToCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.learn.grpc.stubs.AddToCartRequest,
      com.learn.grpc.stubs.AddToCartResponse> getAddToCartMethod() {
    io.grpc.MethodDescriptor<com.learn.grpc.stubs.AddToCartRequest, com.learn.grpc.stubs.AddToCartResponse> getAddToCartMethod;
    if ((getAddToCartMethod = AddToCartServiceGrpc.getAddToCartMethod) == null) {
      synchronized (AddToCartServiceGrpc.class) {
        if ((getAddToCartMethod = AddToCartServiceGrpc.getAddToCartMethod) == null) {
          AddToCartServiceGrpc.getAddToCartMethod = getAddToCartMethod =
              io.grpc.MethodDescriptor.<com.learn.grpc.stubs.AddToCartRequest, com.learn.grpc.stubs.AddToCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addToCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.grpc.stubs.AddToCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.grpc.stubs.AddToCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddToCartServiceMethodDescriptorSupplier("addToCart"))
              .build();
        }
      }
    }
    return getAddToCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddToCartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddToCartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddToCartServiceStub>() {
        @java.lang.Override
        public AddToCartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddToCartServiceStub(channel, callOptions);
        }
      };
    return AddToCartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddToCartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddToCartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddToCartServiceBlockingStub>() {
        @java.lang.Override
        public AddToCartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddToCartServiceBlockingStub(channel, callOptions);
        }
      };
    return AddToCartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddToCartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddToCartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddToCartServiceFutureStub>() {
        @java.lang.Override
        public AddToCartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddToCartServiceFutureStub(channel, callOptions);
        }
      };
    return AddToCartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AddToCartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addToCart(com.learn.grpc.stubs.AddToCartRequest request,
        io.grpc.stub.StreamObserver<com.learn.grpc.stubs.AddToCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddToCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.learn.grpc.stubs.AddToCartRequest,
                com.learn.grpc.stubs.AddToCartResponse>(
                  this, METHODID_ADD_TO_CART)))
          .build();
    }
  }

  /**
   */
  public static final class AddToCartServiceStub extends io.grpc.stub.AbstractAsyncStub<AddToCartServiceStub> {
    private AddToCartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddToCartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddToCartServiceStub(channel, callOptions);
    }

    /**
     */
    public void addToCart(com.learn.grpc.stubs.AddToCartRequest request,
        io.grpc.stub.StreamObserver<com.learn.grpc.stubs.AddToCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddToCartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddToCartServiceBlockingStub> {
    private AddToCartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddToCartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddToCartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.learn.grpc.stubs.AddToCartResponse addToCart(com.learn.grpc.stubs.AddToCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToCartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddToCartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AddToCartServiceFutureStub> {
    private AddToCartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddToCartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddToCartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.learn.grpc.stubs.AddToCartResponse> addToCart(
        com.learn.grpc.stubs.AddToCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_TO_CART = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddToCartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddToCartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_TO_CART:
          serviceImpl.addToCart((com.learn.grpc.stubs.AddToCartRequest) request,
              (io.grpc.stub.StreamObserver<com.learn.grpc.stubs.AddToCartResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AddToCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddToCartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.learn.grpc.stubs.AddToCart.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddToCartService");
    }
  }

  private static final class AddToCartServiceFileDescriptorSupplier
      extends AddToCartServiceBaseDescriptorSupplier {
    AddToCartServiceFileDescriptorSupplier() {}
  }

  private static final class AddToCartServiceMethodDescriptorSupplier
      extends AddToCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddToCartServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AddToCartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddToCartServiceFileDescriptorSupplier())
              .addMethod(getAddToCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
