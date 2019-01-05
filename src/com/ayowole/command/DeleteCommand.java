package com.ayowole.command;

class DeleteCommand implements Command {

    @Override
    public User execute(User user) {
        Database.delete(user);
        
        System.out.println("deleted");
        
        return null;
    }

}
