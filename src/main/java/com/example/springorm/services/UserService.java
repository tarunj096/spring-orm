package com.example.springorm.services;

import com.example.springorm.entities.User;
import com.example.springorm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User updateUser(User user, int userId);
    void deleteUser(int userId);
    List<User> getAllUser();
    User getUser(int userId);

}
