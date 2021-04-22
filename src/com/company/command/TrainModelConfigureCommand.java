package com.company.command;

public class TrainModelConfigureCommand implements Command{
    TrainModel trainModel;

    public TrainModelConfigureCommand(TrainModel trainModel) {
        this.trainModel = trainModel;
    }

    @Override
    public void execute() {
        trainModel.trainModel();
    }
}
