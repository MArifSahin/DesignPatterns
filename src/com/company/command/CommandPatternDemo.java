package com.company.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        CreateModelConfigureCommand createModelConfigureCommand = new CreateModelConfigureCommand(new CreateModel("linear regression"));
        TrainModelConfigureCommand trainModelConfigureCommand= new TrainModelConfigureCommand(new TrainModel("UserInfo","LinearRegressionModel"));

        CommandManager commandManager = new CommandManager();
        commandManager.addCommand(createModelConfigureCommand);
        commandManager.addCommand(trainModelConfigureCommand);

        commandManager.execute();
        
    }
}
