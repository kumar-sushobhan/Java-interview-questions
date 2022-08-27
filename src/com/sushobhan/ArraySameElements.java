package com.sushobhan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {
    static boolean sameElements(Object[] arr1, Object[] arr2) {
        Set<Object> uniqueElement1 = new HashSet<>(Arrays.asList(arr1));
        Set<Object> uniqueElement2 = new HashSet<>(Arrays.asList(arr2));

        if (uniqueElement1.size() != uniqueElement2.size())
            return false;
        for (Object obj : uniqueElement1) {
            if (!uniqueElement2.contains(obj))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3, 2, 1};
        Integer[] a2 = {1, 2, 3};
        Integer[] a3 = {1, 2, 3, 4};

        System.out.println(sameElements(a1, a2));
        System.out.println(sameElements(a1, a3));

        int sum = 0;
        for (int i : a1) {
            sum = sum + i;
        }
        System.out.println("Sum of elements : " + sum);
    }
}
