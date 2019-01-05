package com.ayowole.command;

class SelectCommand implements Command {

    @Override
    public User execute(User user) {
        System.out.println("selected");
        
        return Database.select(user);
    }

}
