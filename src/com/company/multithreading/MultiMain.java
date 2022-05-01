package com.company.multithreading;

import java.util.concurrent.*;

public class MultiMain {

    private volatile static int i;

    public static void main(String[] args) throws InterruptedException {
//        Bank bank = new Bank(100);
//
//        Thread add = new CustomThread(bank);
//        Thread withdraw = new Thread(new CustomRunnable(bank));
//
//        withdraw.start();
//        add.start();
//
//        add.join();
//        withdraw.join();
//
//        System.out.println(add.getState());
//        System.out.println(withdraw.getState());
//        System.out.println(bank.getValue());

        CustomCallable callable = new CustomCallable();

        ExecutorService service = Executors.newCachedThreadPool();
        Future<Integer> res = service.submit(callable);
        service.shutdown();

        try {
            System.out.println(res.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("aaa");



    }
}
