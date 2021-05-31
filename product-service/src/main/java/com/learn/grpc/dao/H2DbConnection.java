package com.learn.grpc.dao;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.h2.tools.RunScript;
import org.h2.tools.Server;

public class H2DbConnection {

  private static final Logger LOGGER = Logger.getLogger(H2DbConnection.class.getName());

  private static Server server;

  static {
    try {
      initDatabase(getConnectionToDatabase());
    } catch (SQLException ex) {
      LOGGER.log(Level.SEVERE, "SQL error", ex);
    }
  }

  public static Connection getConnectionToDatabase() {
    Connection connection = null;
    try {
      Class.forName("org.h2.Driver");
      connection = DriverManager.getConnection("jdbc:h2:mem:shoppingDb", "", "");
    } catch (Exception ex) {
      LOGGER.log(Level.SEVERE, "Could not set up connection", ex);
    }
    LOGGER.info("Connection successful !");
    return connection;
  }

  /**
   * Start H2 server
   * @throws SQLException
   */
  public static void startDatabase() throws SQLException {
    server = Server.createTcpServer().start();
  }

  /**
   * Stop the H2 server
   */
  public static void stopDatabase() {
    server.stop();
  }

  public static void initDatabase(Connection conn) throws SQLException {
    InputStream resource = H2DbConnection.class.getClassLoader()
        .getResourceAsStream("initialize.sql");
    RunScript.execute(conn, new InputStreamReader(resource));
  }
}
