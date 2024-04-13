package com.sushobhan.threads;

public class Thread1 extends Thread {
    public Thread1(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        // whatever is written here will execute in a different thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside : " + Thread.currentThread() + " " +i);
        }
    }
}
