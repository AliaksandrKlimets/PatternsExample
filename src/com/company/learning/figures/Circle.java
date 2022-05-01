package com.company.learning.figures;

public class Circle implements Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimetr() {
        return 2 * radius * Math.PI;
    }
}
