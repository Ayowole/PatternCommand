package com.ayowole.command;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();

        commands.add(new InsertCommand());
        commands.add(new SelectCommand());
        commands.add(new UpdateCommand());
        commands.add(new DeleteCommand());

        User user = new User();

        user.setId(1);
        user.setName("Paulo");

        commands.get(0).execute(user);
        System.out.println(commands.get(1).execute(user));
        
        commands.get(2).execute(new User(1, "Ricardo"));
        
        System.out.println(commands.get(1).execute(user));
        
        commands.get(3).execute(user);
    }

}
