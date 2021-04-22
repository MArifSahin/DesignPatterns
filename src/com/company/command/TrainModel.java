package com.company.command;

public class TrainModel {
    private String data;
    private String model;

    public TrainModel(String data, String model) {
        this.data = data;
        this.model = model;
    }


    public void trainModel(){
        System.out.println(model + " trained with " + data);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
