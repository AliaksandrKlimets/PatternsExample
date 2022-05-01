package com.company.adapter;

public class RoundPeg implements Peg {

    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }
}
