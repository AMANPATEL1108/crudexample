package com.example.crudexample.api.service;

import com.example.crudexample.api.Repository.UserRepo;
import com.example.crudexample.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;

    public String createuser(User user) {
        userRepo.save(user);
        return "User Created SuccessFully";
    }

    public User findUserById(Integer id) {
        return userRepo.findUserById(id);
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public String deleteByID(Integer id) {
        userRepo.deleteById(id);
        return "User Deleted Successfully";
    }

    public String updateById(Integer id, User user) {
        Optional<User> optionalUser = userRepo.findById(id);
        if (optionalUser.isPresent()) {
            user.setId(id);
            userRepo.save(user);
            return "User details Successfully Updated";
        } else {
            return "User not found with ID: " + id;
        }
    }


}
