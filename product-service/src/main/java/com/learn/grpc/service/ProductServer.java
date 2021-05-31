package com.learn.grpc.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductServer {

  private static final Logger LOGGER = Logger.getLogger(ProductServer.class.getName());
  private Server server;

  public void startServer() {
    int port = 50053;
    try {
      server = ServerBuilder.forPort(port).addService(new ProductService()).build().start();
      LOGGER.info("server started on port " + port);

      Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            LOGGER.info("clean shutdown incase JVM was shutdown");
            try {
              ProductServer.this.stopServer();
            } catch (InterruptedException e) {
              LOGGER.log(Level.SEVERE, "Thread interrupted", e);
            }
          })
      );
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "Error starting grpc server for OrderService");
    }
  }

  public void stopServer() throws InterruptedException {
    if (server != null) {
      server.awaitTermination(30, TimeUnit.SECONDS);
    }
  }

  public void blockUntilShutdown() throws InterruptedException {
    if(server !=null) {
      server.awaitTermination();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ProductServer productServer = new ProductServer();
    productServer.startServer();
    productServer.blockUntilShutdown();
  }
}
