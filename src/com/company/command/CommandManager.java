package com.company.command;

import java.util.Stack;

public class CommandManager {
    Stack<Command> commands = new Stack<>();

    public void addCommand(Command command) {
        commands.push(command);
    }
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
