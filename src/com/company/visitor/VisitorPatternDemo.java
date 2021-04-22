package com.company.visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        MetaApplication application = new MetaApplication();
        application.accept(new PersonalDataCollectionVisitor());
        System.out.println();
        application.accept(new UsageBehaviorDataCollectionVisitor());
    }
}
