package com.company.adapter2;

import java.util.HashMap;
import java.util.Map;

public class NameAdapter extends RussianName {

    private Map<String, String> conventions = new HashMap<>();

    public NameAdapter(EnglishName name) {
        super(name.getName());
        this.conventions.put("Alex", "Саша");
    }

    @Override
    public String getName() {
        return conventions.get(super.getName());
    }
}
