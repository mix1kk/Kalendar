package com.myProject.databaseManager.DomainLayer;

import java.util.ArrayList;

public interface UsersDaoInterface {
    void addUser(Users user);
    ArrayList<Users> getAllUsers();
    Users getUserById(int id);
    void updateUser(Users user);
    void removeUser(Users user);
    void removeUser(int id);
    void removeUser(String name);

}
