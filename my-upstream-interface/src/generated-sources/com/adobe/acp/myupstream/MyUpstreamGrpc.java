package com.adobe.acp.myupstream;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: my_upstream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyUpstreamGrpc {

  private MyUpstreamGrpc() {}

  public static final java.lang.String SERVICE_NAME = "myupstream.MyUpstream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.adobe.acp.myupstream.AssetId,
      com.adobe.acp.myupstream.AssetInfo> getGetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfo",
      requestType = com.adobe.acp.myupstream.AssetId.class,
      responseType = com.adobe.acp.myupstream.AssetInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.adobe.acp.myupstream.AssetId,
      com.adobe.acp.myupstream.AssetInfo> getGetInfoMethod() {
    io.grpc.MethodDescriptor<com.adobe.acp.myupstream.AssetId, com.adobe.acp.myupstream.AssetInfo> getGetInfoMethod;
    if ((getGetInfoMethod = MyUpstreamGrpc.getGetInfoMethod) == null) {
      synchronized (MyUpstreamGrpc.class) {
        if ((getGetInfoMethod = MyUpstreamGrpc.getGetInfoMethod) == null) {
          MyUpstreamGrpc.getGetInfoMethod = getGetInfoMethod =
              io.grpc.MethodDescriptor.<com.adobe.acp.myupstream.AssetId, com.adobe.acp.myupstream.AssetInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.adobe.acp.myupstream.AssetId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.adobe.acp.myupstream.AssetInfo.getDefaultInstance()))
              .setSchemaDescriptor(new MyUpstreamMethodDescriptorSupplier("GetInfo"))
              .build();
        }
      }
    }
    return getGetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.adobe.acp.myupstream.AssetId,
      com.adobe.acp.myupstream.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
      requestType = com.adobe.acp.myupstream.AssetId.class,
      responseType = com.adobe.acp.myupstream.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.adobe.acp.myupstream.AssetId,
      com.adobe.acp.myupstream.NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<com.adobe.acp.myupstream.AssetId, com.adobe.acp.myupstream.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = MyUpstreamGrpc.getGetNodeInfoMethod) == null) {
      synchronized (MyUpstreamGrpc.class) {
        if ((getGetNodeInfoMethod = MyUpstreamGrpc.getGetNodeInfoMethod) == null) {
          MyUpstreamGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod =
              io.grpc.MethodDescriptor.<com.adobe.acp.myupstream.AssetId, com.adobe.acp.myupstream.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.adobe.acp.myupstream.AssetId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.adobe.acp.myupstream.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new MyUpstreamMethodDescriptorSupplier("GetNodeInfo"))
              .build();
        }
      }
    }
    return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.adobe.acp.myupstream.Limit,
      com.adobe.acp.myupstream.PageInfo> getGetPageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPage",
      requestType = com.adobe.acp.myupstream.Limit.class,
      responseType = com.adobe.acp.myupstream.PageInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.adobe.acp.myupstream.Limit,
      com.adobe.acp.myupstream.PageInfo> getGetPageMethod() {
    io.grpc.MethodDescriptor<com.adobe.acp.myupstream.Limit, com.adobe.acp.myupstream.PageInfo> getGetPageMethod;
    if ((getGetPageMethod = MyUpstreamGrpc.getGetPageMethod) == null) {
      synchronized (MyUpstreamGrpc.class) {
        if ((getGetPageMethod = MyUpstreamGrpc.getGetPageMethod) == null) {
          MyUpstreamGrpc.getGetPageMethod = getGetPageMethod =
              io.grpc.MethodDescriptor.<com.adobe.acp.myupstream.Limit, com.adobe.acp.myupstream.PageInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.adobe.acp.myupstream.Limit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.adobe.acp.myupstream.PageInfo.getDefaultInstance()))
              .setSchemaDescriptor(new MyUpstreamMethodDescriptorSupplier("GetPage"))
              .build();
        }
      }
    }
    return getGetPageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyUpstreamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyUpstreamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyUpstreamStub>() {
        @java.lang.Override
        public MyUpstreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyUpstreamStub(channel, callOptions);
        }
      };
    return MyUpstreamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyUpstreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyUpstreamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyUpstreamBlockingStub>() {
        @java.lang.Override
        public MyUpstreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyUpstreamBlockingStub(channel, callOptions);
        }
      };
    return MyUpstreamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyUpstreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyUpstreamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyUpstreamFutureStub>() {
        @java.lang.Override
        public MyUpstreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyUpstreamFutureStub(channel, callOptions);
        }
      };
    return MyUpstreamFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getInfo(com.adobe.acp.myupstream.AssetId request,
        io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.AssetInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInfoMethod(), responseObserver);
    }

    /**
     */
    default void getNodeInfo(com.adobe.acp.myupstream.AssetId request,
        io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.NodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     */
    default void getPage(com.adobe.acp.myupstream.Limit request,
        io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.PageInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MyUpstream.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class MyUpstreamImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MyUpstreamGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MyUpstream.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MyUpstreamStub
      extends io.grpc.stub.AbstractAsyncStub<MyUpstreamStub> {
    private MyUpstreamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyUpstreamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyUpstreamStub(channel, callOptions);
    }

    /**
     */
    public void getInfo(com.adobe.acp.myupstream.AssetId request,
        io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.AssetInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNodeInfo(com.adobe.acp.myupstream.AssetId request,
        io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.NodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPage(com.adobe.acp.myupstream.Limit request,
        io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.PageInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MyUpstream.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MyUpstreamBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MyUpstreamBlockingStub> {
    private MyUpstreamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyUpstreamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyUpstreamBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.adobe.acp.myupstream.AssetInfo getInfo(com.adobe.acp.myupstream.AssetId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.adobe.acp.myupstream.NodeInfo getNodeInfo(com.adobe.acp.myupstream.AssetId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.adobe.acp.myupstream.PageInfo getPage(com.adobe.acp.myupstream.Limit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MyUpstream.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MyUpstreamFutureStub
      extends io.grpc.stub.AbstractFutureStub<MyUpstreamFutureStub> {
    private MyUpstreamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyUpstreamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyUpstreamFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.adobe.acp.myupstream.AssetInfo> getInfo(
        com.adobe.acp.myupstream.AssetId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.adobe.acp.myupstream.NodeInfo> getNodeInfo(
        com.adobe.acp.myupstream.AssetId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.adobe.acp.myupstream.PageInfo> getPage(
        com.adobe.acp.myupstream.Limit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFO = 0;
  private static final int METHODID_GET_NODE_INFO = 1;
  private static final int METHODID_GET_PAGE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INFO:
          serviceImpl.getInfo((com.adobe.acp.myupstream.AssetId) request,
              (io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.AssetInfo>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((com.adobe.acp.myupstream.AssetId) request,
              (io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.NodeInfo>) responseObserver);
          break;
        case METHODID_GET_PAGE:
          serviceImpl.getPage((com.adobe.acp.myupstream.Limit) request,
              (io.grpc.stub.StreamObserver<com.adobe.acp.myupstream.PageInfo>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.adobe.acp.myupstream.AssetId,
              com.adobe.acp.myupstream.AssetInfo>(
                service, METHODID_GET_INFO)))
        .addMethod(
          getGetNodeInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.adobe.acp.myupstream.AssetId,
              com.adobe.acp.myupstream.NodeInfo>(
                service, METHODID_GET_NODE_INFO)))
        .addMethod(
          getGetPageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.adobe.acp.myupstream.Limit,
              com.adobe.acp.myupstream.PageInfo>(
                service, METHODID_GET_PAGE)))
        .build();
  }

  private static abstract class MyUpstreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyUpstreamBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.adobe.acp.myupstream.MyUpstreamProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyUpstream");
    }
  }

  private static final class MyUpstreamFileDescriptorSupplier
      extends MyUpstreamBaseDescriptorSupplier {
    MyUpstreamFileDescriptorSupplier() {}
  }

  private static final class MyUpstreamMethodDescriptorSupplier
      extends MyUpstreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MyUpstreamMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MyUpstreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyUpstreamFileDescriptorSupplier())
              .addMethod(getGetInfoMethod())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getGetPageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
