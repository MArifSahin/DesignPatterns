package com.company.command;

public class CreateModel {
    private String method;
    private String model;

    public CreateModel(String method) {
        this.method = method;
    }

    public void createModel(){
        System.out.println("Model created with " + method);
        this.model="LinearRegressionModel";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
