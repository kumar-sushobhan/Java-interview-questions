package com.sushobhan.threads;

public class Stack {
    final Object lock;
    private final int[] array;
    private int stackTop;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean push(int element) {
        synchronized (lock) {
            if (isFull())
                return false;
            ++stackTop;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            array[stackTop] = element;
            return true;
        }
    }

    public int pop() {
        synchronized (lock) {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE; // we are inviligating the value as we are removing the element
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            stackTop--;
            return obj;
        }
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }
}
