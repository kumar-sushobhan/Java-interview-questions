package com.sushobhan;

public class EvenAndOddPrinterBy2Threads implements Runnable {
    static int count = 1;
    final Object lock;

    public EvenAndOddPrinterBy2Threads(Object lock) {
        this.lock = lock;
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Runnable r1 = new EvenAndOddPrinterBy2Threads(lock);
        Runnable r2 = new EvenAndOddPrinterBy2Threads(lock);
        Thread evenThread = new Thread(r1, "Even");
        Thread oddThread = new Thread(r2, "Odd");
        evenThread.start();
        oddThread.start();
    }

    @Override
    public void run() {
        while (count < 100) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
                synchronized (lock) {
                    System.out.println("Thread name : " + Thread.currentThread().getName() + " value : " + count);
                    count++;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("Odd")) {
                synchronized (lock) {
                    System.out.println("Thread name : " + Thread.currentThread().getName() + " value : " + count);
                    count++;
                    lock.notify();
                }
            }
        }
    }
}
