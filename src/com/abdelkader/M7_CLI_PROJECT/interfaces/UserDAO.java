package com.abdelkader.M7_CLI_PROJECT.interfaces;

import com.abdelkader.M7_CLI_PROJECT.model.User;

import java.util.List;
import java.util.UUID;

public interface UserDAO {
    void addUser(User user);
    List<User> getAllUsers();
    User findById(UUID id);
}
