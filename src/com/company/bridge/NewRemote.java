package com.company.bridge;

public class NewRemote extends OldRemote {

    public NewRemote(Tv tv) {
        super(tv);
    }

    public void mute() {
        tv.mute();
    }
}
