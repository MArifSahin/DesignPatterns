package com.company.visitor;

public class MusicService implements Application{
    @Override
    public void accept(DataCollectionVisitor visitor) {
        visitor.visit(this);
    }
}
