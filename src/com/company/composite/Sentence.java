package com.company.composite;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Component {

    private List<Component> components = new ArrayList<>();

    public Sentence(List<Component> components) {
        this.components = components;
    }

    @Override
    public void print() {
        for (Component component : components) {
            component.print();
        }

    }
}
