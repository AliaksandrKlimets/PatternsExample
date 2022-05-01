package com.company.composite;

import java.util.Arrays;

public class CompositeMain {

    public static void main(String[] args) {
        new Text(
                Arrays.asList(
                        new Sentence(Arrays.asList(
                                new Word("Hi"),
                                new Word("my"),
                                new Word("name"),
                                new Word("is"),
                                new Word("Alex"),
                                new Word(".")
                        )),
                        new Sentence(Arrays.asList(
                                new Word("I"),
                                new Word("like"),
                                new Word("to"),
                                new Word("cry"),
                                new Word(".")
                        ))))
                .print();
    }
}
