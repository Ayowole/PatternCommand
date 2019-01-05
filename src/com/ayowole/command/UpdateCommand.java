package com.ayowole.command;

class UpdateCommand implements Command {

    @Override
    public User execute(User user) {
        Database.update(user);
        
        System.out.println("updated");
        
        return null;
    }
    
}
