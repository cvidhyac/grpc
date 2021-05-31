package com.learn.grpc.service;

import com.google.protobuf.util.Timestamps;
import com.learn.grpc.dao.OrderDao;
import com.learn.grpc.stubs.Order;
import com.learn.grpc.stubs.OrderRequest;
import com.learn.grpc.stubs.OrderResponse;
import com.learn.grpc.stubs.OrderServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.stream.Collectors;

public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

  private OrderDao orderDao = new OrderDao();

  @Override
  public void getOrdersForUser(OrderRequest request,
      StreamObserver<OrderResponse> responseObserver) {

    List<com.learn.grpc.domain.Order> orders = orderDao.getOrders(request.getUserId());
    List<Order> ordersForUser = orders.stream()
        .map(order -> Order.newBuilder().setUserId(order.getUserId())
            .setOrderId(order.getOrderId())
            .setNoOfItems(order.getNoOfItems())
            .setOrderDate(Timestamps.fromMillis(order.getOrderDate().getTime()))
            .setTotalAmount(order.getTotalAmount()).build()).collect(Collectors.toList());

    OrderResponse orderResponse = OrderResponse.newBuilder().addAllOrder(ordersForUser).build();
    responseObserver.onNext(orderResponse);
    responseObserver.onCompleted();
  }
}
