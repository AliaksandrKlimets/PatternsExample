package com.company.j8;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaMain {

    public static void main(String[] args) {
//        CustomFunctionalInterface customFunctionalInterface = () -> System.out.println("Custom test");
//        customFunctionalInterface.test();
//        customFunctionalInterface.test2();
//        CustomFunctionalInterface.testStatic();

        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass("Alex", "Klimets"));
        list.add(new MyClass("Alex", "Petrov"));
        list.add(new MyClass("Alex", "Ivanov"));
        list.add(new MyClass("George", "Ivanov"));

        Consumer<Object> c = System.out::println;
        Supplier<Object> s = Math::random;
        Function<String, MyClass> f = (a) -> new MyClass(a, a);
        Predicate<String> p = String::isEmpty;
        BiConsumer<String, String> bc = (a, b) -> System.out.println(a + b);

        Stream<MyClass> myStream = list.stream();
        MyClass mc = new MyClass("a", "b");
        list.add(mc);
        Function<MyClass,String> toString = MyClass::getName;
        Function<String,Integer> toInt = String::length;
//        myStream.map(toString.andThen(toInt)).forEach(mc::myConsumer);

        Stream.generate(Math::random)
                .limit(10)
                .map(x -> x * 10)
                .map(Math::floor)
                .map(Double::intValue)
                .sorted(Integer::compareTo)
                .sorted(Comparator.reverseOrder())
                .forEach(c);

//        IntStream.of(1,2,3,4,5).mapToObj(Integer::valueOf).collect(Collectors.toList());

        System.out.println(IntStream.rangeClosed(1, 10).reduce(Integer::max).orElse(100));
        String res = Stream.of("a", "b", "c").collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(res);

        System.out.println(list.stream()
                .reduce(
                        new HashMap<String, MyClass>(),
                        (map, myClass) -> {
                            map.put(myClass.getName(), myClass);
                            return map;
                        },
                        (map1, map2) -> {
                            map1.putAll(map2);
                            return map1;
                        }
                ));

        mc.getList().add("AAAAaaa");
        mc.getList().add("BBBBb");
        mc.getList().add("CCCC");
//        list.stream().flatMap(x -> x.getList().stream())
//                .sorted(Comparator.comparingInt(String::length))
//                .forEach(System.out::println);
        System.out.println("//////////");
        System.out.println(list.stream()
//                .sorted(Comparator.comparing(MyClass::getName).thenComparing(MyClass::getSurname))
//                .collect(Collectors.groupingBy(MyClass::getName, Collectors.toSet())));
                .collect(Collectors.partitioningBy(x -> x.getList().size() > 0,
                        Collectors.maxBy(Comparator.comparingInt(a -> a.getName().length())))));

        Map<Integer, Integer> m = new HashMap<>();
//        Stream.of(1,2,3,4,5).forEach(i -> m.put(i, 0));
        new Random().ints(0, 20).limit(1000).forEach(i -> {
            m.merge(i, 1, Integer::sum);
        });
        System.out.println(m);
    }
}
