package com.fardragi.vulcan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        String urlConnection = "jdbc:mysql://localhost/teste";

        try (Connection conn = DriverManager.getConnection(urlConnection, "root", "sqldev")) {
            System.out.println("Connectado");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
