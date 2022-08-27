package com.sushobhan;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] a = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        findDuplicateElements(a);
    }

    static void findDuplicateElements(int[] a) {
        Set<int[]> uniqueElements = new HashSet<>();
        Stream.of(a)
                .filter(n -> !uniqueElements.add(n))
                .forEach(System.out::println);
    }
}
