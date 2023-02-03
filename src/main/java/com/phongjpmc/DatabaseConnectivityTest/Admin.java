package com.phongjpmc.DatabaseConnectivityTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class Admin {


    public static void databaseConnectivitySuccess(String databaseType) {
        System.out.println("Connectivity to the " + databaseType + " database is successful.");
    }

    public static Connection MySqlconnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Admin.databaseConnectivitySuccess("MySql");

            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/computerpart", "root", "phong0222");
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }


    public static Connection PostgreSqlconnection() {
        try {
            Class.forName("com.postgresql.cj.jdbc.Driver");

            Admin.databaseConnectivitySuccess("PostgreSql");

            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/revbankdb", "postgres", "phong0222");
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }


    public static void main(String args[]) {
        Admin.MySqlconnection();
        Admin.PostgreSqlconnection();
    }
}
