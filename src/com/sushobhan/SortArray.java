package com.sushobhan;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        sortArrayAscending(numbers);
        System.out.println(Arrays.toString(sortArrayDescending(numbers)));
    }

    static void sortArrayAscending(int[] a) {
        Arrays.stream(a)
                .sorted()
                .forEach(System.out::println);
    }

    static Integer[] sortArrayDescending(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);
    }
}
