package com.company.multithreading;

public class CustomRunnable implements Runnable {

    private final Bank bank;

    public CustomRunnable(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
                this.bank.withdraw(10);
        }
        System.out.println("Withdraw finished");
    }
}
