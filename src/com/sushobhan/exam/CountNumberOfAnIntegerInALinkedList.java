package com.sushobhan.exam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfAnIntegerInALinkedList {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(4);
        System.out.println("Linked list is : " + integerList);
        System.out.println("Occurrence of 2 is : " + getOccurrence(integerList, 2));
    }

    static Long getOccurrence(List<Integer> list, int i){
        LinkedHashMap<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return map.get(i);
    }
}
