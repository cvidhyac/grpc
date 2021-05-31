package com.learn.grpc.service;

import com.learn.grpc.client.OrderClient;
import com.learn.grpc.dao.UserDao;
import com.learn.grpc.domain.User;
import com.learn.grpc.stubs.Gender;
import com.learn.grpc.stubs.Order;
import com.learn.grpc.stubs.UserRequest;
import com.learn.grpc.stubs.UserResponse;
import com.learn.grpc.stubs.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

  private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class.getName());
  private static final String ORDER_SERVICE_URL = "localhost:50052";

  OrderClient orderClient;

  public List<Order> getOrders(int userId) {
    ManagedChannel channel = ManagedChannelBuilder.forTarget(ORDER_SERVICE_URL).usePlaintext().build();
    OrderClient orderClient = new OrderClient(channel);
    List<Order> orders = orderClient.getOrders(userId);
    try {
      channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      LOGGER.log(Level.SEVERE, "Thread interrupted", e);
    }
    LOGGER.info("Number of orders" + orders.size());
    return orders;
  }

  @Override
  public void getUserDetails(UserRequest request, StreamObserver<UserResponse> responseObserver) {
    UserDao userDao = new UserDao();
    User user = userDao.getDetails(request.getUserName());
    UserResponse userResponse = UserResponse.newBuilder()
        .setId(user.getId())
        .setUserName(user.getUserName())
        .setName(user.getName())
        .setAge(user.getAge())
        .setGender(Gender.valueOf(user.getGender()))
        .setNumberOfOrders(getOrders(user.getId()).size())
        .build();

    responseObserver.onNext(userResponse);
    responseObserver.onCompleted();
  }
}
