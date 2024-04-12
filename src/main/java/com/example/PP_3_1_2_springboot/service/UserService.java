package com.example.PP_3_1_2_springboot.service;

import com.example.PP_3_1_2_springboot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(User user);
    void deleteUser(long id);

}
