package com.company.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Music music1 = new Classical(new Piano());
        music1.playMusic();

        Music music2 = new Jazz(new Guitar());
        music2.playMusic();
    }
}
