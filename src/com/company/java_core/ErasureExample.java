package com.company.java_core;

public class ErasureExample<T> {

    private Class<T> clazz;

    ErasureExample(Class<T> clazz) {
        this.clazz = clazz;
    }

    public boolean isCast(T t) {
        return this.clazz.isInstance(t);
    }
}
