package com.myProject.databaseManager.DatabaseDao;

import com.myProject.databaseManager.Connection.ConnectionManager;
import com.myProject.databaseManager.utils.Users;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UsersDao implements UsersDaoInterface {



    @Override
    public void addUser(Users user) {
        Connection connection = ConnectionManager.getConnection();
        String sql = """
                CREATE TABLE IF NOT EXISTS test123(
                id SERIAL PRIMARY KEY,
                data TEXT NOT NULL
                )""";
        try (Statement statement = connection.createStatement();){
            var executeResult = statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Create statement Failed");
            e.printStackTrace();
        }


    }

    @Override
    public List<Users> getAllUsers() {
        return null;
    }

    @Override
    public Users getUserById(int id) {
        return null;
    }

    @Override
    public void updateUser(Users user) {

    }

    @Override
    public void removeUser(Users user) {

    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public void removeUser(String name) {

    }
}
