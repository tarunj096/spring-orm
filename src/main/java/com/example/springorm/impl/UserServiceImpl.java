package com.example.springorm.impl;

import com.example.springorm.entities.User;
import com.example.springorm.repositories.UserRepository;
import com.example.springorm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        logger.info("User saved {}",savedUser.getId());
        return savedUser;
    }
    @Override
    public User updateUser(User user, int userId) {
        User oldUser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User with given id not found"));
        oldUser.setName(user.getName());
        oldUser.setCity(user.getCity());
        oldUser.setAge(user.getAge());
        // rest of the details can be updated if added
        User save = userRepository.save(oldUser);
        return save;
    }

    @Override
    public void deleteUser(int userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found with the id"));
        userRepository.delete(user);
        logger.info("USER DELETED");
    }

    //get all users
    @Override
    public List<User> getAllUser() {
        List<User> users = userRepository.findAll();
        return users;
    }


    //get single user with given id
    @Override
    public User getUser(int userId) {
        Optional<User> userOp = userRepository.findById(userId);
        User user = userOp.orElseThrow(() -> new RuntimeException("User wih given id not found"));
        return user;
    }
}
