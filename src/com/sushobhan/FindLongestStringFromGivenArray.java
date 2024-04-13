package com.sushobhan;

import java.util.Arrays;

public class FindLongestStringFromGivenArray {
    public static void main(String[] args) {
        String[] strArray = {"java", "sushobhan", "microservices", "kafka", "testng"};
        System.out.println("Longest string is : " + longestString(strArray));
    }

    private static String longestString(String[] strArray) {
        return Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
    }
}
