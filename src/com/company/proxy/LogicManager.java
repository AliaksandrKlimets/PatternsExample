package com.company.proxy;

public class LogicManager {

    private SomeLogic someLogic;

    public LogicManager(SomeLogic someLogic) {
        this.someLogic = someLogic;
    }

    public void performLogic(int value) {
        System.out.println(someLogic.calculate(value));
    }

}
