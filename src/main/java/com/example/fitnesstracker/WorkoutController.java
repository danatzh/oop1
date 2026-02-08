package com.example.fitnesstracker;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    // GET
    @GetMapping
    public List<WorkoutPlan> getAll() throws SQLException {
        return WorkoutDAO.getAllWorkouts();
    }

    // POST
    @PostMapping
    public String create(@RequestBody WorkoutPlan workout) throws SQLException {
        WorkoutDAO.createWorkout(workout);
        return "Workout created";
    }

    // PUT
    @PutMapping("/{id}")
    public String update(@PathVariable int id,
                         @RequestBody WorkoutPlan workout) throws SQLException {

        WorkoutDAO.updateWorkout(id, workout);
        return "Workout updated";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) throws SQLException {
        WorkoutDAO.deleteWorkout(id);
        return "Workout deleted";
    }
}
