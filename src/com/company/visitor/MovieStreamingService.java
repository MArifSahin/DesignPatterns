package com.company.visitor;

public class MovieStreamingService implements Application {
    @Override
    public void accept(DataCollectionVisitor visitor) {
        visitor.visit(this);
    }
}
