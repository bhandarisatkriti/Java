package online.banking.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connector {
    Connection connection;
    Statement statement;

    public Connector() {
        try {
            // Remove the data type 'Connection' from the next line
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineBanking", "root", "Kashyap@000");
            statement = connection.createStatement();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
