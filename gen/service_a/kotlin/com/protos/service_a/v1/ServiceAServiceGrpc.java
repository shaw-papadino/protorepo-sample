package com.protos.service_a.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.1)",
    comments = "Source: protos/service_a/v1/service_a.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceAServiceGrpc {

  private ServiceAServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "protos.service_a.v1.ServiceAService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.protos.service_a.v1.SayHelloRequest,
      com.protos.service_a.v1.SayHelloResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.protos.service_a.v1.SayHelloRequest.class,
      responseType = com.protos.service_a.v1.SayHelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protos.service_a.v1.SayHelloRequest,
      com.protos.service_a.v1.SayHelloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.protos.service_a.v1.SayHelloRequest, com.protos.service_a.v1.SayHelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = ServiceAServiceGrpc.getSayHelloMethod) == null) {
      synchronized (ServiceAServiceGrpc.class) {
        if ((getSayHelloMethod = ServiceAServiceGrpc.getSayHelloMethod) == null) {
          ServiceAServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.protos.service_a.v1.SayHelloRequest, com.protos.service_a.v1.SayHelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protos.service_a.v1.SayHelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protos.service_a.v1.SayHelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceAServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAServiceStub>() {
        @java.lang.Override
        public ServiceAServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAServiceStub(channel, callOptions);
        }
      };
    return ServiceAServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceAServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAServiceBlockingStub>() {
        @java.lang.Override
        public ServiceAServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceAServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceAServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAServiceFutureStub>() {
        @java.lang.Override
        public ServiceAServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceAServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sayHello(com.protos.service_a.v1.SayHelloRequest request,
        io.grpc.stub.StreamObserver<com.protos.service_a.v1.SayHelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServiceAService.
   */
  public static abstract class ServiceAServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceAServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServiceAService.
   */
  public static final class ServiceAServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceAServiceStub> {
    private ServiceAServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.protos.service_a.v1.SayHelloRequest request,
        io.grpc.stub.StreamObserver<com.protos.service_a.v1.SayHelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServiceAService.
   */
  public static final class ServiceAServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceAServiceBlockingStub> {
    private ServiceAServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.protos.service_a.v1.SayHelloResponse sayHello(com.protos.service_a.v1.SayHelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServiceAService.
   */
  public static final class ServiceAServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceAServiceFutureStub> {
    private ServiceAServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protos.service_a.v1.SayHelloResponse> sayHello(
        com.protos.service_a.v1.SayHelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

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
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.protos.service_a.v1.SayHelloRequest) request,
              (io.grpc.stub.StreamObserver<com.protos.service_a.v1.SayHelloResponse>) responseObserver);
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
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.protos.service_a.v1.SayHelloRequest,
              com.protos.service_a.v1.SayHelloResponse>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class ServiceAServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceAServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.protos.service_a.v1.ServiceAProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceAService");
    }
  }

  private static final class ServiceAServiceFileDescriptorSupplier
      extends ServiceAServiceBaseDescriptorSupplier {
    ServiceAServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceAServiceMethodDescriptorSupplier
      extends ServiceAServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceAServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceAServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceAServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
