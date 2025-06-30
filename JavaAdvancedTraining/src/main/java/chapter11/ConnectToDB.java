package chapter11;

import java.sql.*;

public class ConnectToDB {
    public static void main(String[] args) {
        String connectionUrl = " ";

        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            Statement stm = connection.createStatement();
            String strSelect = "SELECT * FROM Customers";
            ResultSet results = stm.executeQuery(strSelect);

            while (results.next()){
                System.out.println(results.getString("CustomerID") + "\t" + results.getString(2));
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
