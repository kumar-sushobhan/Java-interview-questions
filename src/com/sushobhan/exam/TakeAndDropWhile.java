package com.sushobhan.exam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TakeAndDropWhile {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> integerList = numbers.stream()
                .takeWhile(n -> n < 5)
                .collect(Collectors.toList());
        System.out.println(integerList);
        System.out.println(numbers.stream()
                .dropWhile(n -> n > 5)
                .collect(Collectors.toList()));
        List<Integer> integerList1 = numbers.stream()
                .dropWhile(n -> n < 3)
                .takeWhile(n -> n < 7)
                .toList();
        System.out.println(integerList1);

        Map<String, Integer> minMaxMap = numbers.stream()
                .collect(Collectors.teeing(Collectors.maxBy(Integer::compareTo),
                        Collectors.minBy(Integer::compareTo),
                        (e1, e2) -> Map.of("max", e1.get(), "min", e2.get())));
        System.out.println(minMaxMap);
    }
}
