package com.company.composite;

public class Word implements  Component {

    private String value;

    public Word(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(this.value + " ");
    }
}
