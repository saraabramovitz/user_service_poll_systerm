package com.userServicePollSysterm.service;

import com.userServicePollSysterm.model.User;
import com.userServicePollSysterm.pollSystem.PollService;
import com.userServicePollSysterm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PollService pollService;


    @Override
    public void createUser(User user) {
            if (user.getId() == null){
                String userEmail = user.getEmail();
                if(userRepository.getUserByEmail(userEmail) == null){
                    userRepository.createUser(user);
                } else {
                    throw new IllegalArgumentException("Email already exists.");
                }
            } else {
                throw new IllegalArgumentException("User already exists.");
            }
    }

    @Override
    public void updateUser(User user) {
        try {
            User selectedUser = userRepository.getUserById(user.getId());
            if (selectedUser != null) {
                if (user.getEmail() == selectedUser.getEmail()) {
                    userRepository.updateUser(user);
                } else {
                    if (userRepository.getUserByEmail(user.getEmail()) == null) {
                        userRepository.updateUser(user);
                    } else {
                        throw new IllegalArgumentException("Email already exists.");
                    }
                }
            } else {
                throw new IllegalArgumentException("User does not exist.");
            }
        } catch (IllegalArgumentException e){
            throw e;
        }
    }


    @Override
    public void deleteUserById(Long userId) {
        pollService.deletePollAnswersByUserId(userId);
        if(userRepository.getUserById(userId) != null){
            userRepository.deleteUserById(userId);
        } else {
            throw new IllegalArgumentException("User does not exist.");
        }
    }

    @Override
    public User getUserById(Long userId) {
        try {
            if(userRepository.getUserById(userId) != null){
                return userRepository.getUserById(userId);
            } else {
                throw new IllegalArgumentException("User does not exist.");
            }
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void registerUserById(Long userId) {
        try {
            if(userRepository.getUserById(userId) != null){
                userRepository.registerUserById(userId);
            } else {
                throw new IllegalArgumentException("User does not exist.");
            }
        } catch (IllegalArgumentException e){
            throw e;
        }
    }



}