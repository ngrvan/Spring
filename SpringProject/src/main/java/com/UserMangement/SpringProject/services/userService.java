package com.UserMangement.SpringProject.services;

import java.util.List;

import com.UserMangement.SpringProject.entity.User;

public interface userService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}