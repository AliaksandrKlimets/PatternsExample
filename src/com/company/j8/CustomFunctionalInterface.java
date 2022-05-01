package com.company.j8;

@FunctionalInterface
public interface CustomFunctionalInterface<T> {

    boolean test(T t);

    default CustomFunctionalInterface<T> negate() {
        return (t) -> !test(t);
    }

    default void test2() {
        System.out.println("Default method");
    }

    static void testStatic() {
        System.out.println("Static");
    }
}
