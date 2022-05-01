package com.company.learning;

public class Cow extends  Animal{
    public Cow(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Mooooo");
    }
}
