package com.example.fitnesstracker;

import java.util.Objects;

public class User {
    private int userId;
    private String name;
    private int age;
    private double weight;

    public User() {
    }

    public User(int userId, String name, int age, double weight) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getUserId() {return userId;}

    public void setUserId(int userId) {this.userId = userId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    @Override
    public String toString() {
        return "User{id=" + userId + ", name='" + name + "', age=" + age + ", weight=" + weight + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
