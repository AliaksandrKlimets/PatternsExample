package com.company.java_core;

import java.util.ArrayList;
import java.util.List;

public class CoreMain {

    public static void main(String[] args) throws Exception {
        ErasureExample<Number> i = new ErasureExample<>(Number.class);
        System.out.println(i.isCast(1.0));

        List<? super Integer> a = new ArrayList<Number>();
        a.add(1);
        Object d = a.get(0);

        List<? extends Number> b = new ArrayList<Integer>() {{ add(2); }};
        Number c = b.get(0);
    }
}

