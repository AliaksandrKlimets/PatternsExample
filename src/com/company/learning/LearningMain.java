package com.company.learning;

public class LearningMain {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom", "Abessin");
        System.out.println(cat.getName());
        Cat cat2 = (Cat) cat;
        System.out.println(cat2.getType());

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Tom", "Abessin");
        animals[1] = new Dog("Gooffy");
        animals[2] = new Cow("Leonora");
        voices(animals);
    }

    public static void voices(Animal[] animals) {
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
