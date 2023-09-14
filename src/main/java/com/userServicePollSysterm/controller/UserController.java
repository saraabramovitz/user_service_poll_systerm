package com.userServicePollSysterm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.userServicePollSysterm.model.User;
import com.userServicePollSysterm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/create")
    public void createUser(@RequestBody User user) throws JsonProcessingException {
        userService.createUser(user);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUserById(@PathVariable Long userId){
        userService.deleteUserById(userId);
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @PutMapping("register/{userId}")
    public void registerUserById(@PathVariable Long userId){
        userService.registerUserById(userId);
    }





}
