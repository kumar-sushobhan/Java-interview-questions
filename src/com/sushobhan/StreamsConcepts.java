package com.sushobhan;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamsConcepts {

    private static final Object object = new Object();
    private static final IntPredicate evenCondition = e -> e%2 == 0;
    private static final IntPredicate oddCondition = e -> e%2 !=0;
    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> StreamsConcepts.printResult(evenCondition));
        CompletableFuture.runAsync(() -> StreamsConcepts.printResult(oddCondition));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printResult(IntPredicate condition) {
        IntStream.rangeClosed(1,100)
                .filter(condition)
                .forEach(StreamsConcepts::execute);
    }

    private static void execute(int i) {
        synchronized (object) {
            System.out.println("Thread name : " + Thread.currentThread().getName() + " : " + i);
            object.notify();
            try {
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
