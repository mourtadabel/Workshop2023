package org.example;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
        String url= "";
        String username="root";
        String password ="";
        try {
            Class.forName("");
            connection connection = DriverManager.getConnection(url,username,password);

            Statement statement= connection.createStatement();
            ResultSet result = statement.executeQuery("select * from Utilisateur ");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
