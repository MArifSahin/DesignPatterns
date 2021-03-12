package com.company.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Composite composite1 = new Composite("Composite root");

        Composite composite2 = new Composite("Composite2");
        Composite composite3 = new Composite("Composite3");
        Composite composite4 = new Composite("Composite4");

        composite1.add(composite2);
        composite1.add(composite3);
        composite1.add(composite4);

        Composite composite5 = new Composite("Composite5 leaf");
        Composite composite6 = new Composite("Composite6");
        Composite composite7 = new Composite("Composite7 leaf");

        composite4.add(composite5);
        composite4.add(composite6);

        composite6.add(composite7);
    }
}
