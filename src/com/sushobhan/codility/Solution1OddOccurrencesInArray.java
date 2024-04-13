package com.sushobhan.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1OddOccurrencesInArray {
    public int solution(int[] A) {

        Map<Integer, int[]> counters = new HashMap<>(A.length / 2 + 1);

        for (int value : A) {
            int[] counter = counters.computeIfAbsent(value, integer -> new int[]{0});
            counter[0]++;
        }

        for (Map.Entry<Integer, int[]> entry : counters.entrySet()) {
            if (entry.getValue()[0] % 2 == 1) {
                return entry.getKey();
            }
        }
        Arrays.sort(A);
        throw new IllegalArgumentException("Single value not found in array: " + Arrays.toString(A));
    }
}