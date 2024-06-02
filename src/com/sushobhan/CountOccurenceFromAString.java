package com.sushobhan;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountOccurenceFromAString {
    public static void main(String[] args) {
        String s = "aaaamnyyy";
        LinkedHashMap<String, Long> map = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
    }
}
