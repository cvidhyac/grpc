package com.learn.grpc.dao;

import com.learn.grpc.domain.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderDao {

  private static final Logger LOGGER = Logger.getLogger(OrderDao.class.getName());

  public List<Order> getOrders(int userId) {
    Connection connection = H2DbConnection.getConnectionToDatabase();
    List<Order> orders = new ArrayList<>();
    try {
      PreparedStatement preparedStatement = connection
          .prepareStatement("select * from orders where user_id=?");
      preparedStatement.setInt(1, userId);
      ResultSet rs = preparedStatement.executeQuery();
      while (rs.next()) {
        Order order = new Order();
        order.setOrderId(rs.getInt("order_id"));
        order.setOrderDate(rs.getDate("order_date"));
        order.setNoOfItems(rs.getInt("no_of_items"));
        order.setTotalAmount(rs.getDouble("total_amount"));
        order.setUserId(rs.getInt("user_id"));
        orders.add(order);
      }
      preparedStatement.setInt(1, userId);
    } catch (SQLException ex) {
      LOGGER.log(Level.SEVERE, "Could not connect to database", ex);
    }
    return orders;
  }

}
