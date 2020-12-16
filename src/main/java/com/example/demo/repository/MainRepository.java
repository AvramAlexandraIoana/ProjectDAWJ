package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.UserComanda;
import com.example.demo.querys.Querys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MainRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getUsers() {
//       List<User> userList = jdbcTemplate.query(Querys.GET_USERS_SQL,new UserRowMapper());
//       List<User> userList = jdbcTemplate.query(Querys.GET_USERS_SQL, (resultSet, i) -> new User(
//               resultSet.getInt("userId"),
//               resultSet.getString("firstName"),
//               resultSet.getString("lastName")
//               ));
        List<User> userList = jdbcTemplate.query(Querys.GET_USERS_SQL, new BeanPropertyRowMapper<>(User.class));
        return userList;
    }

    public List<User> addUser(User user) {
        jdbcTemplate.update(Querys.ADD_USER_SQL, user.getFirstName(), user.getLastName());
        return jdbcTemplate.query(Querys.GET_USERS_SQL, new BeanPropertyRowMapper<>(User.class));
    }

    public List<User> deleteUser(int id) {
        jdbcTemplate.update(Querys.DELETE_USER, id);
        return jdbcTemplate.query(Querys.GET_USERS_SQL, new BeanPropertyRowMapper<>(User.class));
    }

    public List<UserComanda> getUsersComanda() {
        return jdbcTemplate.query(Querys.COMANDA_USER, new BeanPropertyRowMapper<>(UserComanda.class));
    }

//    public class UserRowMapper implements RowMapper<User> {
//
//        @Override
//        public User mapRow(ResultSet resultSet, int i) throws SQLException {
//           return new User(
//                   resultSet.getInt("userId"),
//                   resultSet.getString("firstName"),
//                   resultSet.getString("lastName")
//           );
//        }
//    }


}
