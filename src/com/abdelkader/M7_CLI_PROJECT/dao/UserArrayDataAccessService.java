package com.abdelkader.M7_CLI_PROJECT.dao;

import com.abdelkader.M7_CLI_PROJECT.interfaces.UserDAO;
import com.abdelkader.M7_CLI_PROJECT.model.User;

import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

public class UserArrayDataAccessService implements UserDAO {

    private final List<User> users;



    public UserArrayDataAccessService() {
        this.users = new ArrayList<>();
        this.users.add(new User(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"), "James"));
        this.users.add(new User(UUID.fromString("b10d126a-3608-4980-9f9c-aa179f5cebc3"), "Jamila"));
    }

    @Override
    public void addUser(User user) {

       
//        User[] newUsers = new User[users.length + 1];
//        System.arraycopy(users, 0, newUsers, 0, users.length);
//        newUsers[users.length] = user;
//        users = newUsers;
        // throw new UnsupportedOperationException("Add user operation is not supported in UserArrayDataAccessService");
        users.add(user);
    }


    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
     

    @Override
    public User findById(UUID id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
