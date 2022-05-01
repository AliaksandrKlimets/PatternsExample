package com.company.learning;

public class Cat extends Animal{

    private String type;

    public Cat(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void voice() {
        System.out.println("Meow " + this.name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
