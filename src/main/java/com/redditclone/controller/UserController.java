package com.redditclone.controller;

import com.redditclone.model.User;
import com.redditclone.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// User CRUD
@RestController
public class UserController {

    @Autowired  // Dependency Injection SOS!!!!!!!!!!!!!
    private UserService userService;

    // Create user
    @PostMapping("/user")
    public User userPost(@RequestBody User user) {
        //save user to db
        return user;
    }

    // Read User
    @GetMapping("/user/{userId}")
    public User userWorld(@PathVariable(value = "userId") Long userId) {

        // Get from db the user with id 'userId'
        return userService.getUserById(userId);
    }

    // Update user
    @PutMapping("/user/{userId}")
    public User userPut(@PathVariable(value = "userId") Long userId, @RequestBody User user) {
        // update user
        return user;
    }

    // Delete user
    @DeleteMapping("/user/{userId}")
    public User userDelete(@PathVariable(value = "userId") Long userId) {
        return null;
    }


}
