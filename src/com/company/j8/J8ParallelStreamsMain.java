package com.company.j8;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class J8ParallelStreamsMain {

    public static void main(String[] args) throws Exception {
//        new J8ParallelStreamsMain().go();

        List<Future<Integer>> futures = new ArrayList<>();
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
         Future<Integer> future =  service.submit(() -> getRemote(1));
         futures.add(future);
        }
        System.out.println("Next steps");
        for (int i = 0; i < 5; i++) {
            System.out.println(futures.get(i).get());
        }
        service.shutdown();
    }

    void go() throws InterruptedException, ExecutionException {
        for (int i = 0; i < 10; i++) {
            CompletableFuture
                    .supplyAsync(() -> getRemote(new Random().nextInt(100)))
                    .thenAcceptAsync(System.out::println);
        }
        System.out.println("Выполняется...");
    }

    public static Integer getRemote(int id) {
            int sleep = (int) (2000 * Math.random());
            System.out.println("id " + id + " is sleeping for " + sleep);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return id;
    }

}
