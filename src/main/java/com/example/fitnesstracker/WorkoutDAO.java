package com.example.fitnesstracker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkoutDAO {

    // CREATE
    public static void createWorkout(WorkoutPlan workout) throws SQLException {
        String sql = "INSERT INTO workout_plans (plan_name, exercises) VALUES (?, ?)";

        try (Connection c = DatabaseManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, workout.getPlanName());
            ps.setString(2, workout.getExercises());
            ps.executeUpdate();
        }
    }

    // READ
    public static List<WorkoutPlan> getAllWorkouts() throws SQLException {
        List<WorkoutPlan> list = new ArrayList<>();
        String sql = "SELECT * FROM workout_plans";

        try (Connection c = DatabaseManager.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new WorkoutPlan(
                        rs.getInt("workout_id"),
                        rs.getString("plan_name"),
                        rs.getString("exercises")
                ));
            }
        }
        return list;
    }

    // UPDATE
    public static void updateWorkout(int id, WorkoutPlan workout) throws SQLException {
        String sql = "UPDATE workout_plans SET plan_name=?, exercises=? WHERE workout_id=?";

        try (Connection c = DatabaseManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, workout.getPlanName());
            ps.setString(2, workout.getExercises());
            ps.setInt(3, id);
            ps.executeUpdate();
        }
    }

    // DELETE
    public static void deleteWorkout(int id) throws SQLException {
        String sql = "DELETE FROM workout_plans WHERE workout_id=?";

        try (Connection c = DatabaseManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
