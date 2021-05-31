package com.learn.grpc.service;

import com.learn.grpc.dao.UserDao;
import com.learn.grpc.domain.User;
import com.learn.grpc.stubs.Gender;
import com.learn.grpc.stubs.UserRequest;
import com.learn.grpc.stubs.UserResponse;
import com.learn.grpc.stubs.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

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
        .build();

    responseObserver.onNext(userResponse);
    responseObserver.onCompleted();
  }
}
