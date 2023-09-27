package com.userServicePollSysterm.service;

import com.userServicePollSysterm.model.User;
import com.userServicePollSysterm.pollSystem.PollService;
import com.userServicePollSysterm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PollService pollService;

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void deleteUserById(Long userId) {
        System.out.println("hhhhhhhhhhhhhhhhhhhhhh");
        pollService.deletePollAnswersByUserId(userId);
        System.out.println("hhhhhhhhhhhhhhhhhhhhhh");
        userRepository.deleteUserById(userId);


    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    public void registerUserById(Long id) {
        if (userRepository.checkIfUserExists(id)) {
            userRepository.registerUserById(id);
        } else {
            throw new EntityNotFoundException("User with id " + id + " not found.");
        }
    }

}

