//refined abstraction 2
package com.company.bridge;

public class Classical extends Music {

    public Classical(InstrumentAPI instrumentAPI) {
        super(instrumentAPI);
    }

    @Override
    public void playMusic() {
        instrumentAPI.playInstrument("classical music notes");
    }
}
