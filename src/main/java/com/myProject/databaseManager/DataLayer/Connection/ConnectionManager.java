package com.myProject.databaseManager.DataLayer.Connection;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
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
    private Connection connection = null;

    private static DataSource createDataSource() {
        final PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl(DatabasePropertiesUtil.get(URL_KEY));
        dataSource.setUser(DatabasePropertiesUtil.get(USERNAME_KEY));
        dataSource.setPassword(DatabasePropertiesUtil.get(PASSWORD_KEY));
        return dataSource;
    }

    public ConnectionManager() {
    }
    public Connection getConnection() {
        DataSource dataSource = createDataSource();
        try {
            Connection conn = dataSource.getConnection();
           return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        /*if (this.connection == null)
            //todo: сделать метод не статичным
        try  {
            this.connection = ConnectionManager.open();
            System.out.println("Successfully connected to database -" + connection.getTransactionIsolation());

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return this.connection;*/
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
