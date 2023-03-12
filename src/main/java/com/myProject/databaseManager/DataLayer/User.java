package com.myProject.databaseManager.DataLayer;

import com.myProject.databaseManager.DomainLayer.UsersDaoInterface;
import com.myProject.databaseManager.DataLayer.Connection.ConnectionManager;
import com.myProject.databaseManager.DomainLayer.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class User implements UsersDaoInterface {

    public User() {
    }
    Connection connection;
    ConnectionManager connectionManager = new ConnectionManager();

    @Override
    public void addUser(Users user) {
        connection = connectionManager.getConnection();
        String query = """
                CREATE TABLE IF NOT EXISTS "user"(
                id SERIAL PRIMARY KEY,
                name TEXT,
                tabelNumber INT,
                position TEXT,
                birthday DATE,
                employeeDate DATE,
                schedule TEXT,
                subUnit TEXT,
                "group" TEXT,
                phoneNumber TEXT,
                emailAddress TEXT,
                electroGroup DATE);
                INSERT INTO "user" VALUES (?,?,?,?,?,?,?,?,?,?,?,?)
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1,user.getId());
            statement.setString(2,user.getName());
            statement.setInt(3,user.getTabelNumber());
            statement.setString(4,user.getPosition());
            statement.setDate(5, new java.sql.Date(user.getBirthday().getTimeInMillis()));
            statement.setDate(6, new java.sql.Date(user.getBirthday().getTimeInMillis()));
            statement.setString(7,user.getSchedule());
            statement.setString(8,user.getSubUnit());
            statement.setString(9,user.getGroup());
            statement.setString(10,user.getPhoneNumber());
            statement.setString(11,user.getEmailAddress());
            statement.setDate(12, new java.sql.Date(user.getBirthday().getTimeInMillis()));
            System.out.println(statement);
            var executeResult = statement.execute();
            System.out.println("Sending data to database successful");
        } catch (SQLException e) {
            System.out.println("Create statement Failed");
            e.printStackTrace();
        }


    }

    @Override
    public ArrayList<Users> getAllUsers() {

        ArrayList<Users> users = new ArrayList<Users>();
        Calendar calendar = Calendar.getInstance();
        connection = connectionManager.getConnection();
        String query = """
                SELECT * FROM "user"
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
            Users user = new Users();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setTabelNumber(resultSet.getInt("tabelNumber"));
            user.setPosition(resultSet.getString("Position"));
            calendar.setTime(resultSet.getDate("birthday"));
            user.setBirthday(calendar);
            calendar.setTime(resultSet.getDate("employeeDate"));
            user.setEmployeeDate(calendar);
            user.setSchedule(resultSet.getString("schedule"));
            user.setSubUnit(resultSet.getString("subUnit"));
            user.setGroup(resultSet.getString("group"));
            user.setPhoneNumber(resultSet.getString("phoneNumber"));
            user.setEmailAddress(resultSet.getString("emailAddress"));
            calendar.setTime(resultSet.getDate("electroGroup"));
            user.setElectroGroup(calendar);
            users.add(user);}
           for (Users user : users){
               System.out.println(user.getName());}
            return users;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        @Override
    public Users getUserById(int id) {
        Users user = new Users();
        Calendar calendar = Calendar.getInstance();
        connection = connectionManager.getConnection();
        String query = """
                SELECT * FROM "user" WHERE id=?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1,id);
            System.out.println(statement);
          //  var executeResult = statement.execute();
            ResultSet  resultSet = statement.executeQuery();
            resultSet.next();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setTabelNumber(resultSet.getInt("tabelNumber"));
            user.setPosition(resultSet.getString("Position"));
            calendar.setTime(resultSet.getDate("birthday"));
            user.setBirthday(calendar);
            calendar.setTime(resultSet.getDate("employeeDate"));
            user.setEmployeeDate(calendar);
            user.setSchedule(resultSet.getString("schedule"));
            user.setSubUnit(resultSet.getString("subUnit"));
            user.setGroup(resultSet.getString("group"));
            user.setPhoneNumber(resultSet.getString("phoneNumber"));
            user.setEmailAddress(resultSet.getString("emailAddress"));
            calendar.setTime(resultSet.getDate("electroGroup"));
            user.setElectroGroup(calendar);

            System.out.println("Get data from database successful");

        } catch (SQLException e) {
            System.out.println("Create statement Failed");
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void updateUser(Users user) {
        Calendar calendar = Calendar.getInstance();
        connection = connectionManager.getConnection();
        String query = """
                UPDATE "user" SET (
                "name",tabelNumber,"position",birthday,employeeDate,schedule,subUnit,"group",phoneNumber,emailAddress,electroGroup) =
                (?,?,?,?,?,?,?,?,?,?,?)
                WHERE id=?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){

            statement.setString(1,user.getName());
            statement.setInt(2,user.getTabelNumber());
            statement.setString(3,user.getPosition());
            statement.setDate(4, new java.sql.Date(user.getBirthday().getTimeInMillis()));
            statement.setDate(5, new java.sql.Date(user.getBirthday().getTimeInMillis()));
            statement.setString(6,user.getSchedule());
            statement.setString(7,user.getSubUnit());
            statement.setString(8,user.getGroup());
            statement.setString(9,user.getPhoneNumber());
            statement.setString(10,user.getEmailAddress());
            statement.setDate(11, new java.sql.Date(user.getBirthday().getTimeInMillis()));
            statement.setInt(12,user.getId());
            System.out.println(statement);
            var executeResult = statement.execute();
            System.out.println("Update data in database is successful");
        } catch (SQLException e) {
            System.out.println("Create statement Failed");
            e.printStackTrace();
        }
    }

    @Override
    public void removeUser(Users user) {//todo:переписать на проверку всех полей юзера
        connection = connectionManager.getConnection();
        String query = """
                DELETE FROM "user" WHERE id=?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1,user.getId());
            System.out.println(statement);
            var executeResult = statement.execute();
            System.out.println("Delete data from database successful");
        } catch (SQLException e) {
            System.out.println("Create statement Failed");
            e.printStackTrace();
        }

    }

    @Override
    public void removeUser(int id) {
        connection = connectionManager.getConnection();
        String query = """
                DELETE FROM "user" WHERE id=?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1,id);
            System.out.println(statement);
            var executeResult = statement.execute();
            System.out.println("Delete data from database successful");
        } catch (SQLException e) {
            System.out.println("Create statement Failed");
            e.printStackTrace();
        }
    }

    @Override
    public void removeUser(String name) {
        connection = connectionManager.getConnection();
        String query = """
                DELETE FROM "user" WHERE name=?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1,name);
            System.out.println(statement);
            var executeResult = statement.execute();
            System.out.println("Delete data from database successful");
        } catch (SQLException e) {
            System.out.println("Create statement Failed");
            e.printStackTrace();
        }
    }
}
