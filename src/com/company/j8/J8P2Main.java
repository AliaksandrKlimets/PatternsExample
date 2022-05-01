package com.company.j8;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;

public class J8P2Main {

    public static void main(String[] args) {
//        System.out.println("Instant.now(): " + Instant.now());
//        System.out.println("LocalDate.now(): " + LocalDate.now());
//        System.out.println("LocalTime.now(): " + LocalTime.now());
//        System.out.println("LocalDateTime.now(): " + LocalDateTime.now());
//        System.out.println("ZonedDateTime.now(): " + ZonedDateTime.now());
//
//        LocalDateTime ldt = LocalDateTime.of(2021, Month.AUGUST, 3, 20,20);
//        ZonedDateTime zdt = ldt.atZone(ZoneId.of("America/Marigot"));
//        System.out.println(zdt);
//        System.out.println(zdt.withZoneSameInstant(ZoneId.of("Europe/Kiev")));
//        System.out.println(Month.FEBRUARY.length(true));
//
//        System.out.println(ldt.with((temporal) -> temporal.with(DAY_OF_MONTH, 1)));

        List<InnerClass> list = new ArrayList<InnerClass>(){{
            add(new InnerClass("USD", 20));
            add(new InnerClass("USD", 30));
            add(new InnerClass("USD", 40));
        }};

        System.out.println(list.stream()
                .collect(Collectors.toMap(InnerClass::getCurrency, InnerClass::getVal, Integer::sum))
                .entrySet()
                .stream()
                .map(i -> new InnerClass(i.getKey(), i.getValue()))
                .findFirst()
                .get()
        );
    }

    static class InnerClass {
        private String currency;

        private int val;

        public InnerClass(String currency, int val) {
            this.currency = currency;
            this.val = val;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return currency + " " + val;
        }
    }
}
