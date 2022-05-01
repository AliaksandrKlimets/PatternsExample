package com.company.composite;

import java.util.ArrayList;
import java.util.List;

public class Text implements Component {

    private List<Component> components = new ArrayList<>();

    public Text(List<Component> components) {
        this.components = components;
    }

    @Override
    public void print() {
        for (Component component : components) {
            component.print();
        }
    }
}
