package com.example.fitnesstracker;

import java.util.List;
import java.util.Objects;

public class WorkoutPlan {
    private int workoutId;
    private String planName;
    private List<String> exercises;


    public WorkoutPlan(int workoutId, String planName, List<String> exercises) {
        this.workoutId = workoutId;
        this.planName = planName;
        this.exercises = exercises;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public void setExercises(List<String> exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "WorkoutPlan{id=" + workoutId + ", planName='" + planName + "', exercises=" + exercises + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkoutPlan that = (WorkoutPlan) o;
        return workoutId == that.workoutId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workoutId);
    }
}
