package com.example.PP_3_1_2_springboot.dao;

import com.example.PP_3_1_2_springboot.model.User;
import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(User user);
    void deleteUser(long id);

}
