package com.example.fitnesstracker.console;

import com.example.fitnesstracker.DatabaseManager;
import com.example.fitnesstracker.User;
import com.example.fitnesstracker.UserDAO;

import java.sql.Connection;

public class MainDB {
    public static void main(String[] args) throws Exception {

        Connection connection = DatabaseManager.getConnection();
        System.out.println("CONNECTED TO DATABASE");
        connection.close();

        User u1 = new User(0, "Alice", 25, 60);
        User u2 = new User(0, "Bob", 30, 75);

        UserDAO.createUser(u1);
        UserDAO.createUser(u2);

        System.out.println("Users from database:");
        UserDAO.readUsers();

        UserDAO.updateUserWeight(1, 65);

        UserDAO.deleteUser(2);
    }
}
