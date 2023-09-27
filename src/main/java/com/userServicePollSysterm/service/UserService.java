package com.userServicePollSysterm.service;

import com.userServicePollSysterm.model.User;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserService {
    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(Long userId);
    User getUserById(Long id);
    void registerUserById(Long id);
}
