package com.company.proxy;

public class LoggedSomeLogicImpl implements SomeLogic {

    private SomeLogic someLogic;

    public LoggedSomeLogicImpl(SomeLogic someLogic) {
        this.someLogic = someLogic;
    }

    @Override
    public int calculate(int value) {
        System.out.println("Method performed");
        return someLogic.calculate(value);
    }
}
