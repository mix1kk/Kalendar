package com.myProject.databaseManager.DatabaseDao;

import com.myProject.databaseManager.utils.Users;

import java.util.List;

public interface UsersDaoInterface {
    void addUser(Users user);
    List <Users> getAllUsers();
    Users getUserById(int id);
    void updateUser(Users user);
    void removeUser(Users user);
    void removeUser(int id);
    void removeUser(String name);

}
