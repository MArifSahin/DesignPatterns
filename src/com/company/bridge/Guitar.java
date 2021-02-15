//Concrete implementation 2 for bridge pattern
package com.company.bridge;

public class Guitar implements InstrumentAPI {

    @Override
    public void playInstrument(String notes) {
        System.out.println("Playing the guitar with the " + notes);
    }
}
