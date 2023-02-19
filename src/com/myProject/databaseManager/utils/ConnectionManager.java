package com.myProject.databaseManager.utils;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public final class ConnectionManager {
    private static final String PASSWORD_KEY = "db.password";
    private static final String USERNAME_KEY = "db.username";
    private static final String URL_KEY = "db.url";

    private ConnectionManager() {
    }

    public static Connection open() {
        try {
            return DriverManager.getConnection(
                    DatabasePropertiesUtil.get(URL_KEY),
                    DatabasePropertiesUtil.get(USERNAME_KEY),
                    DatabasePropertiesUtil.get(PASSWORD_KEY));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
