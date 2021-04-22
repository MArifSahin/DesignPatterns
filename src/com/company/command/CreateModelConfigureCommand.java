package com.company.command;

public class CreateModelConfigureCommand implements Command {
    CreateModel createModel;

    public CreateModelConfigureCommand(CreateModel createModel) {
        this.createModel = createModel;
    }

    @Override
    public void execute() {
        createModel.createModel();

    }
}
