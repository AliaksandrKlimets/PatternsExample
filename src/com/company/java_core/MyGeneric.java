package com.company.java_core;

import java.util.List;

public class MyGeneric<T extends Number> implements Comparable<Integer> {

    MyGeneric() {

        this(5);
    }

    MyGeneric(int a) {
    }

    public T a;

    public void test(T t) {

        System.out.println(t);
    }

    public void test(List<T> t) {
        System.out.println(t);
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
