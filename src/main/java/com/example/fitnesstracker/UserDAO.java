package com.example.fitnesstracker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public static void createUser(User user) throws SQLException {
        String sql = "INSERT INTO users (name, age, weight) VALUES (?, ?, ?)";

        try (Connection c = DatabaseManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, user.getName());
            ps.setInt(2, user.getAge());
            ps.setDouble(3, user.getWeight());
            ps.executeUpdate();
        }
    }

    public static void readUsers() throws SQLException {
        String sql = "SELECT * FROM users";

        try (Connection c = DatabaseManager.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("user_id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age") + " " +
                                rs.getDouble("weight")
                );
            }
        }
    }

    public static void updateUserWeight(int user_id, double weight) throws SQLException {
        String sql = "UPDATE users SET weight=? WHERE user_id=?";

        try (Connection c = DatabaseManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setDouble(1, weight);
            ps.setInt(2, user_id);
            ps.executeUpdate();
        }
    }

    public static void deleteUser(int user_id) throws SQLException {
        String sql = "DELETE FROM users WHERE user_id=?";

        try (Connection c = DatabaseManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, user_id);
            ps.executeUpdate();
        }
    }

    public static List<User> getUsersAsList() throws SQLException {
        List<User> users = new ArrayList<>();

        String sql = "SELECT * FROM users";

        try (Connection c = DatabaseManager.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                users.add(new User(
                        rs.getInt("user_id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getDouble("weight")
                ));
            }
        }
        return users;
    }

}
