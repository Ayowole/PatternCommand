package com.ayowole.command;

class InsertCommand implements Command {

    @Override
    public User execute(User user) {
        Database.insert(user);
        
        System.out.println("inserted");
        
        return null;
    }

}
