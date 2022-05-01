package com.company.bridge;

public class Samsung implements Tv {

    private int volume;

    public Samsung() {
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void volumeUp(int up) {
        this.volume += up;
    }

    @Override
    public void volumeDown(int down) {
        this.volume -= down;
    }

    @Override
    public void mute() {
        this.volume = 0;
    }
}
