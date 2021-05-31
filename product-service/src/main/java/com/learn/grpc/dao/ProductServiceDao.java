package com.learn.grpc.dao;

import com.learn.grpc.domain.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ProductServiceDao {

  private static Logger LOGGER = Logger.getLogger(ProductServiceDao.class.getName());

  public List<Product> getProductDetails(String productName) {
    List<Product> products = new ArrayList<>();
    try {
      Connection connection = H2DbConnection.getConnectionToDatabase();
      PreparedStatement preparedStatement = connection
          .prepareStatement("select * from product_service where product_name=?");
      preparedStatement.setString(1, productName);
      ResultSet rs = preparedStatement.executeQuery();
      while (rs.next()) {
        Product product = new Product();
        product.setProductName(rs.getString("product_name"));
        product.setId(rs.getInt("id"));
        product.setQuantity(rs.getInt("quantity"));
        products.add(product);
      }
    } catch (SQLException ex) {
      LOGGER.severe("Cannot get product details");
    }
    return products;
  }
}
