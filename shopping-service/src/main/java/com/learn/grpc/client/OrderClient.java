package com.learn.grpc.client;

import com.learn.grpc.stubs.Order;
import com.learn.grpc.stubs.OrderRequest;
import com.learn.grpc.stubs.OrderResponse;
import com.learn.grpc.stubs.OrderServiceGrpc;
import io.grpc.Channel;
import java.util.List;

public class OrderClient {

  //get the stub of the object
  //call the service method
  private OrderServiceGrpc.OrderServiceBlockingStub orderServiceBlockingStub;

  public OrderClient(Channel channel) {
    orderServiceBlockingStub = OrderServiceGrpc.newBlockingStub(channel);
  }

  public List<Order> getOrders(int userId) {
    OrderRequest request = OrderRequest.newBuilder().setUserId(userId).build();
    OrderResponse orderResponse = orderServiceBlockingStub.getOrdersForUser(request);
    return orderResponse.getOrderList();
  }

}
