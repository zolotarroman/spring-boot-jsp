package com.roman.service;

import com.roman.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    void delete(long id);
    User getByName(String name);
    User editUser(User user);
    List<User> getAll();
}
