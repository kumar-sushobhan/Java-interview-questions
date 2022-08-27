package com.sushobhan;

import java.util.Arrays;
import java.util.List;

public class FindAllNumbersStartingWith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream()
                .map(s -> s + "") // Converting integer to string
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
