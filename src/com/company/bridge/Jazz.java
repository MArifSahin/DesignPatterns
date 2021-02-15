//refined abstraction 1
package com.company.bridge;

public class Jazz extends Music {

    public Jazz(InstrumentAPI instrumentAPI) {
        super(instrumentAPI);
    }

    @Override
    public void playMusic() {
        instrumentAPI.playInstrument("jazz notes");
    }
}
