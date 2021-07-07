package com.fardragi.vulcan.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String urlConnection = "jdbc:mysql://localhost/original";
        return DriverManager.getConnection(urlConnection, "root", "sqldev");
    }
}
