package com.sushobhan;

public class PrintNumbersAndAlphabetsAlternate {
    private static final Object lock = new Object();
    private static boolean printLetter = true;

    public static void main(String[] args) throws InterruptedException {
        // Alphabet
        Runnable alphabetTask = () -> {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                synchronized (lock) {
                    if (!printLetter) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(" " + ch);
                    printLetter = false;
                    lock.notify();
                }
            }
        };

        // Number
        Runnable numberTask = () -> {
            for (int i = 1; i <= 26; i++) {
                synchronized (lock) {
                    if (printLetter) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(" " + i);
                    printLetter = true;
                    lock.notify();
                }
            }
        };
        Thread alphabetThread = new Thread(alphabetTask);
        Thread numberThread = new Thread(numberTask);
        alphabetThread.start();
        numberThread.start();
        alphabetThread.join();
        numberThread.join();
    }
}
