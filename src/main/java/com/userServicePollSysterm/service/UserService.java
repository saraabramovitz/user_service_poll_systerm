package com.userServicePollSysterm.service;

import com.userServicePollSysterm.model.User;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserService {
    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(Long userId);
    User getUserById(Long id);
    List<User> getAllUsers();
    void registerUserById(Long id);

}
