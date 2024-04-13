package com.sushobhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
        System.out.println(isPrime(49));
        System.out.println(isPrime(19));
        System.out.println(primeNumbersBetween(9, 19));
        System.out.println(primeNumbersBetween(2, 100));
    }

    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static List<Integer> primeNumbersBetween(int a, int b) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            int counter = 0;
            if (a == 0 || a == 1 || b == 0 || b == 1) {
                System.out.println("There are no prime numbers between " + a + " and " + b + " ");
                return Collections.singletonList(0);
            }
            for (int j=2; j<=i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 1) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
