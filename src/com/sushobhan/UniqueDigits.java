package com.sushobhan;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueDigits {
    public static void main(String[] args) {
        System.out.println(String.valueOf(25).length());
        System.out.println("Unique digits :" + countUniqueDigits(23462343));
        System.out.println("Unique digits count :" + (long) countUniqueDigits(23462343).size());
    }

    private static Set<String> countUniqueDigits(int number) {
        String s = String.valueOf(number);
        String[] split = s.split("");
        return Arrays.stream(split).collect(Collectors.toSet());
    }
}
