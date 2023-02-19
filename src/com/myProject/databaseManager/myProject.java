package com.myProject.databaseManager;

import com.myProject.databaseManager.utils.ConnectionManager;
import com.myProject.databaseManager.utils.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class myProject {

    public static void main(String[] args) {
        Database database = new Database();
        database.getConnection();
      /*  String sql = """
                CREATE TABLE IF NOT EXISTS test123(
                id SERIAL PRIMARY KEY,
                data TEXT NOT NULL
                )
                """;
        try (Connection connection = ConnectionManager.open();
          Statement statement = connection.createStatement()) {
            System.out.println("Successfully connected to database -" + connection.getTransactionIsolation());
            var executeResult = statement.execute(sql);
            System.out.println(executeResult);


        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
*/

    }
}