package com.sushobhan.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 5, 3, 6, 9, 12, 1);
        System.out.println("Is sorted : " + checkSort(list));
    }

    private static boolean checkSort(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);
        List<Integer> sortedCopyList = copyList.stream()
                .sorted(Comparator.comparing(Function.identity()))
                .toList();
        System.out.println("Sorted array : " + sortedCopyList);
        return sortedCopyList.equals(list);
    }
}
