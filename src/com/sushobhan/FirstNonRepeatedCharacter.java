package com.sushobhan;

import java.util.*;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String text = "sushobhan";
        System.out.println(firstNonRepeatedCharacter(text));
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
}
