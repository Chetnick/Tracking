package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnSingleton {

    private static Connection conn;

    private ConnSingleton() {
    }

    public static Connection getInstance() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection("jdbc:mysql://quince.no-ip.org:3306/tracking", "aca", "qZq3TFVg");
        }
        return conn;
    }

}
