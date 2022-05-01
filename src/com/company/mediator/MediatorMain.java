package com.company.mediator;

public class MediatorMain {

    public static void main(String[] args) {
        RealMediator realMediator = new RealMediator();
        realMediator.getButton1().click();
        realMediator.getButton2().click();
    }
}
