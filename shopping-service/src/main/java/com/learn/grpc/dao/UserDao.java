package com.learn.grpc.dao;

import com.learn.grpc.domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao {

  private static final Logger LOGGER = Logger.getLogger(UserDao.class.getName());

  public User getDetails(String userName) {
    User user = new User();
    try {
      Connection connection = H2DbConnection.getConnectionToDatabase();
      PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username=?");
      preparedStatement.setString(1, userName);
      ResultSet rs = preparedStatement.executeQuery();
      while (rs.next()) {
        user.setId(rs.getInt("id"));
        user.setUserName(rs.getString("username"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        user.setGender(rs.getString("gender"));
      }
    } catch(SQLException ex) {
        LOGGER.log(Level.SEVERE, "Could not execute Query", ex);
    }
    return user;
  }

}
