package com.company.j8;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalMain {

    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass("a", "b");
        Optional<MyClass> myClassOptional = Optional.ofNullable(myClass);

        System.out.println(myClassOptional.map(MyClass::getName));
        List<Integer> arrayList = new LinkedList<>();
        new Random().ints().limit(300).boxed().forEach(arrayList::add);

        Consumer<Integer> c = a -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        System.out.println(new Date().getTime());
        arrayList.stream().forEach(c);

        System.out.println(new Date().getTime());
    }
}
