package pl.coderslab;

import pl.coderslab.model.Exercise;
import pl.coderslab.model.Group;
import pl.coderslab.model.User;
import pl.coderslab.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        User user = new User("martin", "martn@mail.com", "123455667");
        try (Connection connection = DbUtil.getConnection()) {
//            user.saveToDB(connection);
//            user = User.loadUserById(connection,1);
/*            User[] users = User.loadAllUsers(connection);

            System.out.println(Arrays.toString(users));*/


            //         Group group = Group.loadByID(connection, 1);
            //       Group group = new Group("Test");
            //       group.saveToDB(connection);
//            System.out.println(group);
            Group[] groups = Group.loadAll(connection);

            for (Group g : groups) {
                System.out.println(g);
            }
            Exercise exercise = new Exercise("SQL-Basic", "Podstawy baz danych");
            exercise.saveToDB(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
