package com.myProject.databaseManager;

import com.myProject.databaseManager.DataLayer.User;
import com.myProject.databaseManager.DomainLayer.Users;

public class myProject {

    public static void main(String[] args) {
        Users users = new Users();
        User user = new User();
      //  users = user.getUserById(0);
      //  System.out.println(users.getBirthday().getTime());
       //   users.setName("na");
      //  user.updateUser(users);
      //  user.getAllUsers();
       // user.getUserById(0);
     //    users.setId(1);
       user.addUser(users);
      //  user.removeUser(users.getId());
      //  users.setName("name");
     //  user.updateUser(users);
      //  Database database = new Database();
       // database.getConnection();
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