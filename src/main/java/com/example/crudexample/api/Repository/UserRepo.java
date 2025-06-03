package com.example.crudexample.api.Repository;

import com.example.crudexample.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findUserById(Integer id);

}
