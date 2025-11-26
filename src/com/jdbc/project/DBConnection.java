package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/JDBCPROJECT";
    private static final String USER = "root";
    private static final String PASSWORD = "sql123";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
        	System.out.println("❌ DB Connection Failed");
            e.printStackTrace();
            return null;
        }
    }
}
