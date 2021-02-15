//Concrete implementation 1 for bridge pattern
package com.company.bridge;

public class Piano implements InstrumentAPI {

    @Override
    public void playInstrument(String notes) {
        System.out.println("Playing the piano with the " + notes);
    }
}
