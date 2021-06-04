package com.learn.grpc.dao;

import com.learn.grpc.domain.AddToCart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddToCartDao {

  private static final Logger LOGGER = Logger.getLogger(AddToCartDao.class.getName());

  private boolean addProductToCart(AddToCart request) {

    Connection connection = H2DbConnection.getConnectionToDatabase();
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(
          "insert into add_to_cart (product_id, product_name, quantity) values (?, ?, ?)");
      preparedStatement.setInt(1, request.getProduct_id());
      preparedStatement.setString(2, request.getProduct_name());
      preparedStatement.setInt(3, request.getQuantity());
      preparedStatement.executeQuery();

    } catch (SQLException ex) {
      LOGGER.log(Level.SEVERE, "Cannot establish connection to database", ex);
      return false;
    }

    return true;
  }
}
