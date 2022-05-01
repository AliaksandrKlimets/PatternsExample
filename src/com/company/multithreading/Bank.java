package com.company.multithreading;

public class Bank {

    private volatile int value;

    public Bank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized   void add(int value) {
        if (this.value >= 130) {
            try {
                System.out.println("Add waited");
                wait();
                System.out.println("Add notified");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value += value;
        System.out.println("Balance after add is " + this.value);
        notify();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void withdraw(int value) {
        if (this.value <= 100) {
            try {
                System.out.println("Withdraw waited");
                wait();
                System.out.println("Withdraw notified");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value -= value;
        System.out.println("Balance after withdraw is " + this.value);
        notify();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
