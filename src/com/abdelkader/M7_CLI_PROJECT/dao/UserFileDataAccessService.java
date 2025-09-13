package com.abdelkader.M7_CLI_PROJECT.dao;


import com.abdelkader.M7_CLI_PROJECT.interfaces.UserDAO;
import com.abdelkader.M7_CLI_PROJECT.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


//public class UserArrayDataAccessService implements UserDAO {
//
//    private final User[] users;
//
//    public UserArrayDataAccessService() {
//        this.users = new User[]{
//                new User(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"), "James"),
//                new User(UUID.fromString("b10d126a-3608-4980-9f9c-aa179f5cebc3"), "Jamila")
//        };
//    }
//
//    @Override
//    public User[] getUsers() {
//        return users;
//    }
//}

public class UserFileDataAccessService implements UserDAO {
    private static final String FILE_NAME = "src/users.csv";


    // إضافة مستخدم جديد
    @Override
    public  void addUser(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(user.getId() + "," + user.getName());
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file", e);
        }
    }

    // جلب كل المستخدمين
    @Override
    public List<User> getAllUsers() {
        int lineCount = countLines(FILE_NAME);
        // User[] users = new User[lineCount];
        List<User> users = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length == 2) {
                    UUID userId = UUID.fromString(tokens[0].trim());
                    String name = tokens[1].trim();
                    users.add(new User(userId, name));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading from file", e);
        }
        return users;
    }

    // البحث عن مستخدم بـ id
    @Override
    public User findById(UUID id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length == 2) {
                    UUID userId = UUID.fromString(tokens[0].trim());
                    String name = tokens[1].trim();
                    if (userId.equals(id)) {
                        return new User(userId, name);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading from file", e);
        }
        return null;
    }



    private int countLines(String fileName) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { // try with resource
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            return 0;
        }
        return lines;
    }
}
