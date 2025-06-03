package com.example.crudexample.api.controller;


import com.example.crudexample.api.model.User;
import com.example.crudexample.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public String addUser(@RequestBody User user) {
        return userService.createuser(user);
    }

    @GetMapping("/getById/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findUserById(id);
    }

    @GetMapping("/getAll")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @DeleteMapping("/deleteById/{id}")
    public String delteById(@PathVariable Integer id) {
        return userService.deleteByID(id);
    }

    @PutMapping("/update/{id}")
    public String updateByID(@PathVariable Integer id, @RequestBody User user) {
        return userService.updateById(id, user);
    }


}
