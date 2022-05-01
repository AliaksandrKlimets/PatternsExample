package com.company.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedSomeLogicImpl implements SomeLogic {

    private SomeLogic someLogic;

    private Map<Integer, Integer> cache = new HashMap<>();

    public CachedSomeLogicImpl(SomeLogic someLogic) {
        this.someLogic = someLogic;
    }

    @Override
    public int calculate(int value) {
        if (cache.containsKey(value)) {
            System.out.println("Return cached value");
            return cache.get(value);
        }
        int result = someLogic.calculate(value);
        cache.put(value, result);
        return result;
    }
}
