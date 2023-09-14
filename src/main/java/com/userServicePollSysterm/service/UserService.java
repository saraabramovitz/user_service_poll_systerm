package com.userServicePollSysterm.service;

import com.userServicePollSysterm.model.User;
public interface UserService {
    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    void registerUserById(Long id);
}
