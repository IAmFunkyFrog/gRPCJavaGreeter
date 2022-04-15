package com.homework;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {

    private static Server server;

    public static void main(String[] args) throws IOException {
        server = ServerBuilder.forPort(8001).addService(
                new GreeterService()
        ).build();

        server.start();
        System.out.println(server.getListenSockets());
        while (true) {

        }
    }
}
