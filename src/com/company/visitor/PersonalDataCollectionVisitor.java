package com.company.visitor;

public class PersonalDataCollectionVisitor implements DataCollectionVisitor{

    @Override
    public void visit(MetaApplication metaApplication) {
        System.out.println("\nApplications are visited by PersonalDataCollectionVisitor!");
    }

    @Override
    public void visit(MovieStreamingService movieStreamingService) {
        System.out.println("Personal data collected from movie streaming service application");
    }

    @Override
    public void visit(SeriesStreamingService seriesStreamingService) {
        System.out.println("Personal data collected from tv series streaming service application");
    }

    @Override
    public void visit(MusicService musicService) {
        System.out.println("Personal data collected from music service application");
    }
}
