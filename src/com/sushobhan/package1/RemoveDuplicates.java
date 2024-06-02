package com.sushobhan.package1;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String text = "opentext"; //opentx
        removeDuplicates(text);
    }

    static void removeDuplicates(String text) {
        String[] sLists = text.split("");
        Set<String> set = new LinkedHashSet<>();
        Collections.addAll(set, sLists);
        set.forEach(System.out::print);
    }
}
