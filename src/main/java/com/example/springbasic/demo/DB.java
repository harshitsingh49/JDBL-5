package com.example.springbasic.demo;

import java.util.ArrayList;

public class DB {
    private ArrayList< User> userTable = new ArrayList<>();
    public DB() {
        userTable.add(new User(101, "Ram", 25));
    }
}
