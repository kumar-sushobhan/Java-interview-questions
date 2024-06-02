package com.sushobhan;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String text = "sushobhan";
        System.out.println(firstNonRepeatedCharacter(text));
         firstNonRepeatedCharacterJava8(text);
    }

    private static Character firstNonRepeatedCharacter(String text) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] charArray = text.toCharArray();
        for(char c: charArray){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else
                map.put(c, 1);
        }

        for(Map.Entry<Character, Integer>entry: map.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }

    private static void firstNonRepeatedCharacterJava8(String text){
        String s1 = Arrays.stream(text.split(""))
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(s1);
    }
}
