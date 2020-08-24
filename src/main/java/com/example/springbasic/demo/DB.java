package com.example.springbasic.demo;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private ArrayList< User> userTable = new ArrayList<>();
    public DB() {
        userTable.add(new User(101, "Ram", 25));
        userTable.add(new User(102, "Shyam", 30));
    }

    public boolean addAUser(User user) {
        userTable.add(user);
        return true;
    }

    public List<User> getAllUsers() {
        return userTable;
    }

    public User findUser(int id) {
        for(User user : userTable) {
            if (user.getId() == id) return user;
        }
        System.out.println("Couldn't find the user with this id.");
        return null;
    }

}
