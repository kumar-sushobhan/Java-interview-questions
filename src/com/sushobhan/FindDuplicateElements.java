package com.sushobhan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

// To boxed array
        Integer[] what = Arrays.stream(data)
                .boxed()
                .toArray(Integer[]::new);
        Integer[] ever = IntStream.of(data)
                .boxed()
                .toArray(Integer[]::new);

// To boxed list
        List<Integer> you = Arrays.stream(data)
                .boxed()
                .toList();
        List<Integer> like = IntStream.of(data)
                .boxed()
                .toList();

        int[] a = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        findDuplicateElements(a);
    }

    static void findDuplicateElements(int[] a) {
        Integer[] integerArray = Arrays.stream(a)
                .boxed()
                .toArray(Integer[]::new);
        Set<Integer> uniqueElements = new HashSet<>();
        Arrays.stream(integerArray)
                .filter(n -> !uniqueElements.add(n))
                .forEach(System.out::println);
    }
}
