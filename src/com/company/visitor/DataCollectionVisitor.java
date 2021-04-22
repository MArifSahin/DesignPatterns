package com.company.visitor;

public interface DataCollectionVisitor {
    public void visit(MetaApplication metaApplication);
    public void visit(MovieStreamingService movieStreamingService);
    public void visit(SeriesStreamingService seriesStreamingService);
    public void visit(MusicService musicService);
}
