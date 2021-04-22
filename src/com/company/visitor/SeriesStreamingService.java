package com.company.visitor;

public class SeriesStreamingService implements Application{
    @Override
    public void accept(DataCollectionVisitor visitor) {
        visitor.visit(this);
    }
}
