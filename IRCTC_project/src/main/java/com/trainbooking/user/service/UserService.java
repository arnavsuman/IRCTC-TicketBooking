package com.trainbooking.user.service;

import com.trainbooking.user.model.User;
import java.util.HashMap;

public class UserService {
    private final HashMap<String, User> users;

    public UserService() {
        users = new HashMap<>();
    }

    public boolean RegisterUser(String username, String password, String email) {
        if(!users.containsKey(username)){
            User newUser = new User(username, password, email);
            users.put(username, newUser);
            return true;
        }
        else{
            System.out.println("User already exists");
        }
        return false;
    }
    public User getUser(String username){
        return users.get(username);
    }
    public boolean DeleteUser(String username){
        if(users.containsKey(username)){
            users.remove(username);
            return true;
        }
        else{
            System.out.println("User does not exist");
        }
        return false;
    }
}