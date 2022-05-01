package com.company.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(2);

        System.out.println(hole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(3);
        PegAdapter pegAdapter = new PegAdapter(squarePeg);
        System.out.println(hole.fits(pegAdapter));
    }
}
