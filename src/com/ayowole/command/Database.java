package com.ayowole.command;

import java.util.ArrayList;
import java.util.List;

class Database {
    
    private static List<User> info = new ArrayList<>();
    
    public static void insert(User user) {
        info.add(user);
    }
    
    public static User select(User user) {
        return info.stream()
                .filter( (i) -> i.equals(user) )
                .findFirst()
                .get();
    }
    
    public static void update(User user) {
        User foundUser = info.stream().filter( (i) -> i.getId().equals(user.getId()) ).findFirst().get();
        info.remove(foundUser);
        info.add(user);
    }
    
    public static void delete(User user) {
        info.remove(user);
    }
    
}
