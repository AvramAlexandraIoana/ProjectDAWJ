package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.UserComanda;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/get")
    public List<User> getUsers() {
        return mainService.getUsers();
    }

    @PostMapping("/add")
    public List<User> addUser(@RequestBody User user) {
        return mainService.addUser(user);
    }

    @DeleteMapping("/delete")
    public List<User> deleteUser(@RequestParam int userId) {
        return mainService.deleteUser(userId);
    }

    @GetMapping("/getUserComanda")
    public List<UserComanda> getUsersComanda() {
        return mainService.getUsersComanda();
    }



}
