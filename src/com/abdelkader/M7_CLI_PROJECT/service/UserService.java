package com.abdelkader.M7_CLI_PROJECT.service;


import com.abdelkader.M7_CLI_PROJECT.dao.UserFileDataAccessService;
import com.abdelkader.M7_CLI_PROJECT.model.User;

import java.util.List;
import java.util.UUID;

public class UserService {
    private final UserFileDataAccessService userFileDataAccessService;

    public UserService(UserFileDataAccessService userFileDataAccessService) {
        this.userFileDataAccessService = userFileDataAccessService;
    }
    // إضافة مستخدم جديد
    public  void addUser(UUID id, String name) {
        User user = new User(id, name);
        userFileDataAccessService.addUser(user);
    }

    // عرض كل المستخدمين
    public void viewAllUsers() {
        List<User> users = userFileDataAccessService.getAllUsers();
        System.out.println("\n=== All Customers ===");
        for (User c : users) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    // البحث عن مستخدم
    public  User getUserById(UUID id) {
        return userFileDataAccessService.findById(id);
    }


    // get all users
    public List<User> getAllUsers() {
        return userFileDataAccessService.getAllUsers();
    }

    // displaySelectUserIDMenu
    public void displaySelectUserIDMenu() {
        List<User> users = userFileDataAccessService.getAllUsers();
        System.out.println("\n=== Select User ID ===");
        for (User c : users) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
}
