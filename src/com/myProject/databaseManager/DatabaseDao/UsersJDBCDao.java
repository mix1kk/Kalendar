package com.myProject.databaseManager.DatabaseDao;

import com.myProject.databaseManager.utils.ConnectionManager;
import com.myProject.databaseManager.utils.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UsersJDBCDao implements InterfaceUsersDao {

    @Override
    public void addUser(Users user) {

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


}
