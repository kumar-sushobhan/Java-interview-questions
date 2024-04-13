package com.sushobhan;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupByExamples {
    public static void main(String[] args) {
        int[] arr = {8, 6, 3, 44, 78, 32, 18, 15, 24};
        // 1. Group by divisible by 3 and 4
        Map<String, List<Integer>> divisibleBy3OR4 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n -> n % 3 == 0 ? "Divisible by 3" : "Divisible by 4"));
        System.out.println(divisibleBy3OR4);

        int[] arr1 = {2, 4, 2, 3, 1, 78, 3, 1};
        // 2. Remove duplicate elements and print it
        List<Integer> duplicateItems = Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Duplicate elements : " + duplicateItems);

        List<Integer> uniqueItems = Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> !(map.getValue() > 1))
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Duplicate elements : " + uniqueItems);
    }
}
