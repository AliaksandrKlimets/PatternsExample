package com.company.learning.figures;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double square() {
        return side * side;
    }

    @Override
    public double perimetr() {
        return side * 4;
    }
}
