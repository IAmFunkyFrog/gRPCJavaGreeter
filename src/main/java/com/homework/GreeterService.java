package com.homework;

import com.homework.RPC.GreeterGrpc;
import com.homework.RPC.HelloReply;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(com.homework.RPC.HelloRequest request,
                         io.grpc.stub.StreamObserver<com.homework.RPC.HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().
                setMessage("Hello " + request.getName() + " compiler!").build();
        System.out.println("Get message from: " + request.getName());
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
