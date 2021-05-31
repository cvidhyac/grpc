package com.learn.grpc.service;

import com.learn.grpc.dao.ProductServiceDao;
import com.learn.grpc.domain.Product;
import com.learn.grpc.stubs.ProductRequest;
import com.learn.grpc.stubs.ProductResponse;
import com.learn.grpc.stubs.ProductServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService extends ProductServiceGrpc.ProductServiceImplBase {

  ProductServiceDao productServiceDao = new ProductServiceDao();

  @Override
  public void getProductDetails(ProductRequest request,
      StreamObserver<ProductResponse> responseObserver) {
    List<Product> products = productServiceDao.getProductDetails(request.getProductName());
    List<com.learn.grpc.stubs.Product> productsByName = products.stream()
        .map(product -> com.learn.grpc.stubs.Product.newBuilder()
            .setProductName(product.getProductName())
            .setId(product.getId())
            .setQuantity(product.getQuantity())
            .build()).collect(Collectors.toList());

    ProductResponse productResponse = ProductResponse.newBuilder().addAllProduct(productsByName)
        .build();
    responseObserver.onNext(productResponse);
    responseObserver.onCompleted();
  }
}
