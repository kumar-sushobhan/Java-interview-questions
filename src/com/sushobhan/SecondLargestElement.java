package com.sushobhan;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElement {
    static int secondHighest(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
    }

    static int thirdHighest(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .get();
    }

    static int highestNumber(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();
    }

    static int smallestNumber(int[] a){
        return Arrays.stream(a)
                .boxed()
                .sorted()
                .findFirst()
                .get();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        System.out.println(secondHighest(numbers));
        System.out.println(thirdHighest(numbers));
        System.out.println(highestNumber(numbers));
        System.out.println(smallestNumber(numbers));
    }
}
