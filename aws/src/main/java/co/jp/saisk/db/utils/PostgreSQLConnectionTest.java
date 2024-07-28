package co.jp.saisk.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnectionTest {

    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "123456"; // Replace with your PostgreSQL password

        // JDBC variables for opening and managing connection
        Connection con = null;

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Connected to PostgreSQL database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            e.printStackTrace();
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
