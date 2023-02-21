package com.myProject.databaseManager.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Класс открывает соединение с БД через соответствующий драйвер менеджер
 */
public final class ConnectionManager {
    private static final String PASSWORD_KEY = "db.password";
    private static final String USERNAME_KEY = "db.username";
    private static final String URL_KEY = "db.url";
    private static Connection connection = null;
    private ConnectionManager() {
    }
    public static Connection getConnection() {
        if (connection == null)
        try  {
            connection = ConnectionManager.open();
            System.out.println("Successfully connected to database -" + connection.getTransactionIsolation());

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection open() {
        try {
            return DriverManager.getConnection(
                    DatabasePropertiesUtil.get(URL_KEY),//методы передают параметры в геттер, взятые из файла DatabaseConnectionProperties.properties
                    DatabasePropertiesUtil.get(USERNAME_KEY),
                    DatabasePropertiesUtil.get(PASSWORD_KEY));
        } catch (SQLException e) {
            System.out.println("Can not open connection");
            e.printStackTrace();
        }
        return null;
    }

}
