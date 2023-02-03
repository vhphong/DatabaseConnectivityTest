package com.phongjpmc.DatabaseConnectivityTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class Admin {


    public static void mySqlConnectivitySuccess(String databaseType) {
        System.out.println("Connectivity to the " + databaseType + " database is successful.");
    }

    public static Connection MySqlconnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Admin.mySqlConnectivitySuccess("MySql");

            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/computerpart", "root", "phong0222");
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }

    }

    public static void main(String args[]) {
        Admin.MySqlconnection();
    }
}
