package com.company.collections;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class CollectionsMain {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        List<? extends  Number> a = integerList;
        Number b = a.get(0);
        integerList.forEach(System.out::println);

        BigDecimal res = new ArrayList<BigDecimal>()
                .stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(res);
    }

}
