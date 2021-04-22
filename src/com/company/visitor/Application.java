package com.company.visitor;

import javax.xml.crypto.Data;

public interface Application {
    public void accept(DataCollectionVisitor visitor);
}
