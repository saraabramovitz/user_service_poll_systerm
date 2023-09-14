package com.userServicePollSysterm.service;

import com.userServicePollSysterm.model.User;
import com.userServicePollSysterm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        // delete all user data in the poll system
        userRepository.deleteUserById(id);

    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    public void registerUserById(Long id) {
        // check if user is in DB
        if (userRepository.checkIfUserExists(id)) {
            userRepository.registerUserById(id);
        } else {
            throw new EntityNotFoundException("User with id " + id + " not found.");
        }
    }

}

