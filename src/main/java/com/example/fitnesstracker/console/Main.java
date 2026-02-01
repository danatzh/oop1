package com.example.fitnesstracker.console;

import com.example.fitnesstracker.DatabaseManager;
import com.example.fitnesstracker.User;
import com.example.fitnesstracker.UserDAO;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    try {
      Connection connection = DatabaseManager.getConnection();
      System.out.println("CONNECTED TO DATABASE");
      connection.close();
    } catch (Exception e) {
      System.out.println("DATABASE CONNECTION ERROR");
      e.printStackTrace();
      return;
    }

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nChoose action:");
      System.out.println("1 - Add user");
      System.out.println("2 - Show users");
      System.out.println("3 - Update user weight");
      System.out.println("4 - Delete user");
      System.out.println("0 - Exit");

      int choice = scanner.nextInt();
      scanner.nextLine();

      try {
        switch (choice) {

          case 1:
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();

            User user = new User(0, name, age, weight);
            UserDAO.createUser(user);
            System.out.println("USER ADDED");
            break;

          case 2:
            System.out.println("USERS FROM DATABASE:");
            UserDAO.readUsers();
            break;

          case 3:
            System.out.print("Enter user ID: ");
            int updateId = scanner.nextInt();

            System.out.print("Enter new weight: ");
            double newWeight = scanner.nextDouble();

            UserDAO.updateUserWeight(updateId, newWeight);
            System.out.println("USER UPDATED");
            break;

          case 4:
            System.out.print("Enter user ID to delete: ");
            int deleteId = scanner.nextInt();

            UserDAO.deleteUser(deleteId);
            System.out.println("USER DELETED");
            break;

          case 0:
            System.out.println("EXIT");
            return;

          default:
            System.out.println("WRONG OPTION");
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
