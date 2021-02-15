//abstraction in bridge pattern
package com.company.bridge;

abstract class Music {
    protected InstrumentAPI instrumentAPI;

    protected Music(InstrumentAPI instrumentAPI) {
        this.instrumentAPI = instrumentAPI;
    }

    public abstract void playMusic();
}