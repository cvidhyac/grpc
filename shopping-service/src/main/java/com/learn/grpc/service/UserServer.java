package com.learn.grpc.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserServer {

  private static final Logger LOGGER = Logger.getLogger(UserServer.class.getName());
  private Server server;

  public void startServer() {
    int port = 50051;
    try {
      LOGGER.info("Start user server");
      server = ServerBuilder
          .forPort(port)
          .addService(new UserServiceImpl())
          .build()
          .start();

      Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        LOGGER.info("Clean Server Shutdown incase JVM was shutdown");
        try {
          UserServer.this.stopServer();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }));
    } catch (IOException ex) {
      LOGGER.log(Level.SEVERE, "Server did not start", ex);
    }
  }

  public void stopServer() throws InterruptedException {
    if (server != null) {
      server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
    }
  }

  public void blockUntilShutdown() throws InterruptedException {
    if(server !=null) {
      server.awaitTermination();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    UserServer server = new UserServer();
    server.startServer();
    server.blockUntilShutdown();
  }

}
