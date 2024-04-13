package com.sushobhan.threads;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("main is starting...");
        Thread1 thread1 = new Thread1("thread1");
        thread1.start();
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Inside : " + Thread.currentThread() + ", " + i);
            }
        }, "thread2");
        thread2.start();
        System.out.println("main is exiting...");

        Stack stack = new Stack(5);
        new Thread(() -> {
            int counter = 0;
            while (counter < 100) {
                System.out.println("Pushed : " + stack.push(100));
                counter++;
            }
        }, "Pusher").start();

        new Thread(() -> {
            int counter = 0;
            while (counter < 10) {
                System.out.println("Popped : " + stack.pop());
                counter++;
            }
        }, "Popper").start();
    }
}
