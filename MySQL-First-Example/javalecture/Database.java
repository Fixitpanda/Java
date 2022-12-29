package com.javalecture;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    public static void execute() throws ClassNotFoundException {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.159:3306/books","root","password");
            Statement stmt = con.createStatement())
        {

            String query = "SELECT title FROM Book";

            ResultSet rs = stmt.executeQuery(query);

            ArrayList<String> arr = new ArrayList<>();

            while (rs.next()) {
                arr.add(rs.getString("title"));
            }

            System.out.println(arr);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
