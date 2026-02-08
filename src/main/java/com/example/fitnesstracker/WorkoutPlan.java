package com.example.fitnesstracker;

public class WorkoutPlan {

    private int workoutId;
    private String planName;
    private String exercises;

    public WorkoutPlan() {
    }

    public WorkoutPlan(int workoutId, String planName, String exercises) {
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

    public String getExercises() {
        return exercises;
    }

    public void setExercises(String exercises) {
        this.exercises = exercises;
    }
}
