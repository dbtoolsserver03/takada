package co.jp.saisk.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionTest {

    public static void main(String[] args) {
        // JDBC URL, username, and password of Oracle database server
        String url = "jdbc:oracle:thin:@//localhost:1521/EE.oracle.docker";
        String user = "system";
        String password = "oracle";

        // JDBC variables for opening and managing connection
        Connection con = null;

        try {
            // Establish the connection
            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Connected to Oracle database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
