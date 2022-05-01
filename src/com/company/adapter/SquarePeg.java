package com.company.adapter;

public class SquarePeg implements Peg {

    private double radius;

    public SquarePeg(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }
}
