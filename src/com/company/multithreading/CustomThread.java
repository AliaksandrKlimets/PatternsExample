package com.company.multithreading;

public class CustomThread extends Thread {

    private final Bank bank;

    public CustomThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
                this.bank.add(10);
        }
        System.out.println("Add finished");
    }
}
