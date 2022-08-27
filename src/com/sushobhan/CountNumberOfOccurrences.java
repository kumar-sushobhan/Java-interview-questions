package com.sushobhan;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccurrences {
    public static void main(String[] args) {
        countOccurrences(new int[]{2, 5, 6, 7, 4, 3, 5, 4, 2, 4});
    }

    static void countOccurrences(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        System.out.println("Map presentation : " + map);
    }
}
