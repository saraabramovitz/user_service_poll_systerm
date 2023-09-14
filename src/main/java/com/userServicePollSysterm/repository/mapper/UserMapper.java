package com.userServicePollSysterm.repository.mapper;

import com.userServicePollSysterm.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User(
                rs.getLong("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getInt("age"),
                rs.getString("address"),
                rs.getTimestamp("joining_date").toLocalDateTime().toLocalDate(),
                rs.getBoolean("is_registered")
        );
        return user;
    }
}


