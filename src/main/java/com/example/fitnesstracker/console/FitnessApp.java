package com.example.fitnesstracker.console;

import com.example.fitnesstracker.User;
import com.example.fitnesstracker.WorkoutPlan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class FitnessApp {
    private int appId;
    private String appName;
    private List<User> users;
    private List<WorkoutPlan> workoutPlans;

    public FitnessApp(int appId, String appName) {
        this.appId = appId;
        this.appName = appName;
        this.users = new ArrayList<>();
        this.workoutPlans = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addWorkoutPlan(WorkoutPlan workoutPlan) {
        workoutPlans.add(workoutPlan);
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public void sortWorkoutPlansById() {
        workoutPlans.sort(Comparator.comparingInt(WorkoutPlan::getWorkoutId));
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<WorkoutPlan> getWorkoutPlans() {
        return workoutPlans;
    }

    @Override
    public String toString() {
        return "FitnessApp{id=" + appId + ", appName='" + appName + "', users=" + users + ", workoutPlans=" + workoutPlans + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FitnessApp that = (FitnessApp) o;
        return appId == that.appId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId);
    }
}
