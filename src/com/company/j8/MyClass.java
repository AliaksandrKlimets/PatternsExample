package com.company.j8;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    private String name;

    private String surname;

    private List<String> list = new ArrayList<>();

    public MyClass() {
    }

    public MyClass(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void myConsumer(Object a) {
        System.out.println(a);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
