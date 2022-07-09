package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

	static Connection con;

    public static Connection createConn() {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create the connection..
            String user = "root";
            String password = "Lufa@7917";
            String url = "jdbc:mysql://localhost:3306/jdbc";
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
