package com.userServicePollSysterm.repository;

import com.userServicePollSysterm.model.User;
import com.userServicePollSysterm.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    public static final String USER_TABLE_NAME = "user";
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserMapper userMapper;


    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO " + USER_TABLE_NAME + " (first_name, last_name, email, age, address) values (?, ?, ?, ?, ?)";
        jdbcTemplate.update(
            sql,
            user.getFirstName(),
            user.getLastName(),
            user.getEmail(),
            user.getAge(),
            user.getAddress());
    }

    public void updateUser(User user) {
        String sql = "UPDATE " + USER_TABLE_NAME + " SET first_name=?, last_name=?, email=?, age=?, address=? WHERE id=?";
        jdbcTemplate.update(
            sql,
            user.getFirstName(),
            user.getLastName(),
            user.getEmail(),
            user.getAge(),
            user.getAddress(),
            user.getId());
    }

    @Override
    public void deleteUserById(Long id) {
        String sql = "DELETE FROM " + USER_TABLE_NAME + " WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public User getUserById(Long id) {
        String sql = "SELECT * FROM " + USER_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, userMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM " + USER_TABLE_NAME;
        return jdbcTemplate.query(sql, userMapper);
    }

    @Override
    public void registerUserById(Long id) {
        String sql = "UPDATE " + USER_TABLE_NAME + " SET is_registered=true WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public User getUserByEmail(String userEmail) {
        String sql = "SELECT * FROM " + USER_TABLE_NAME + " WHERE email=?";
        try {
            return jdbcTemplate.queryForObject(sql, userMapper, userEmail);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }


}
