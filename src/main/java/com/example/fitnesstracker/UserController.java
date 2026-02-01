package com.example.fitnesstracker;

import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() throws SQLException {
        return UserDAO.getUsersAsList();
    }

    @PostMapping
    public String addUser(@RequestBody User user) throws SQLException {
        UserDAO.createUser(user);
        return "User added";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) throws SQLException {
        UserDAO.deleteUser(id);
        return "User deleted";
    }
}
