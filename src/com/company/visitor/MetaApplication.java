package com.company.visitor;

public class MetaApplication implements Application {

    Application[] applications;

    public MetaApplication(){
        applications = new Application[] {new MovieStreamingService(), new MusicService(), new SeriesStreamingService()};
    }

    @Override
    public void accept(DataCollectionVisitor visitor) {
        for (Application application: applications){
            application.accept(visitor);
        }
        visitor.visit(this);
    }
}
