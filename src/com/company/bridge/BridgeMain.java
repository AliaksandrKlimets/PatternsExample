package com.company.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Tv samsung = new Samsung();
        OldRemote oldRemote = new OldRemote(samsung);
        oldRemote.volumeUp(10);
        oldRemote.volumeDown(5);
        System.out.println(samsung.getVolume());

        NewRemote newRemote = new NewRemote(samsung);
        newRemote.mute();
        System.out.println(samsung.getVolume());
    }
}
