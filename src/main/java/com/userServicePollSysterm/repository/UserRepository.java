package com.userServicePollSysterm.repository;

import com.userServicePollSysterm.model.User;

import java.util.List;

public interface UserRepository {
    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
    void registerUserById(Long id);
    User getUserByEmail(String userEmail);
}
