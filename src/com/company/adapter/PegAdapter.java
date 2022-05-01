package com.company.adapter;

public class PegAdapter extends RoundPeg {

    public PegAdapter(Peg squarePeg) {
        super(squarePeg.getRadius());
    }

    @Override
    public double getRadius() {
        return super.getRadius() * Math.sqrt(2) / 2;
    }
}
