package com.sushobhan;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringUsingJava8 {
    public static void main(String[] args) {
        System.out.println("Reverse string : " + reverseStringJava8("Sushobhan"));
        String str = "my name is kumar sushobhan";
        Optional<String> optionalString = str.chars()
                .mapToObj(c -> String.valueOf((char)c))
                .reduce((s1, s2) -> s2 + s1);
        System.out.println(optionalString.orElse("Failed"));

    }

    private static String reverseStringJava8(String text) {
        return Stream.of(text)
                .map(str -> new StringBuffer(str).reverse())
                .collect(Collectors.joining());
    }
}
