package com.sushobhan.package1;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbersBetweenAGivenRange {
    public static void main(String[] args) {
        System.out.println(getRandomValue(10, 100));
    }

    public static int getRandomValue(int Min, int Max) {
        return ThreadLocalRandom
                .current()
                .nextInt(Min, Max + 1);
    }
}
