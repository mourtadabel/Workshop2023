package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
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