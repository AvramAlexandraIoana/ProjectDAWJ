package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.UserComanda;
import com.example.demo.querys.Querys;
import com.example.demo.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;
    public List<User> getUsers() {
        return mainRepository.getUsers();
    }

    public List<User> addUser(User user) {
        return mainRepository.addUser(user);
    }

    public List<User> deleteUser(int id) {
        return mainRepository.deleteUser(id);
    }

    public List<UserComanda> getUsersComanda() {
        return mainRepository.getUsersComanda();
    }
}
