package com.company.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {

    private String compositeName;

    public List<Composite> compositeList = new ArrayList<>();

    public Composite(String compositeName) {
        this.compositeName = compositeName;
    }

    public void add(Composite composite) {
        compositeList.add(composite);
    }

    public void remove(Composite composite) {
        compositeList.remove(composite);
    }

    public List<Composite> getCompositeList() {
        return compositeList;
    }

}
