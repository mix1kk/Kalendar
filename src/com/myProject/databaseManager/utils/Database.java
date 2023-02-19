package com.myProject.databaseManager.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class Database {

    // установка соединения
    public Connection getConnection() {
        try (Connection connection = ConnectionManager.open();
                /*Statement statement = connection.createStatement()*/) {
            System.out.println("Successfully connected to database -" + connection.getTransactionIsolation());
            return connection;

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return null;
    }

    // получение пользователя из базы данных по имени
public Users getUser(String name){
  Users user = new Users();
//чтение из базы данных и присвоение юзеру нужных полей
  return user;
}

public Users [] getAllUsers(){
     Users [] users = new Users [0];
    //чтение из базы данных и присвоение массива пользователей
    return users;
}
}
