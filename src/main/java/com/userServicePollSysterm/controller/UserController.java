package com.userServicePollSysterm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.userServicePollSysterm.pollSystem.PollService;
import com.userServicePollSysterm.model.User;

import com.userServicePollSysterm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PollService pollService;


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
    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @PutMapping("register/{userId}")
    public void registerUserById(@PathVariable Long userId){
        userService.registerUserById(userId);
    }





}
