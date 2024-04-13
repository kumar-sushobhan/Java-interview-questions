package com.sushobhan;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        isEven(number);
        System.out.println("Count of even numbers : " + countEvenNumbers(2,4,8,12,15));
    }

    private static boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is even : " + number);
            return true;
        } else {
            System.out.println("Number is odd : " + number);
            return false;
        }
    }

    static int countEvenNumbers(int n1, int n2, int n3, int n4, int n5) {
        int count =0;
        if (n1%2 ==0)
            count++;
        if (n2%2 ==0)
            count++;
        if (n3%2 ==0)
            count++;
        if (n4%2 ==0)
            count++;
        if (n5%2 ==0)
            count++;
        return count;
    }
}
