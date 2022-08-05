package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

    Connection conn;

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/reto4";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
        }
        return conn;
    }
}
