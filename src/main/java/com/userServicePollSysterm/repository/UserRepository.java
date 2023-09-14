package com.userServicePollSysterm.repository;

import com.userServicePollSysterm.model.User;

public interface UserRepository {
    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    void registerUserById(Long id);
    Boolean checkIfUserExists(Long id);
}
