package com.company.bridge;

public class OldRemote {

    protected Tv tv;

    public OldRemote(Tv tv) {
        this.tv = tv;
    }

    public void volumeUp(int up) {
        tv.volumeUp(up);
    }

    public void volumeDown(int down) {
        tv.volumeDown(down);
    }

}
