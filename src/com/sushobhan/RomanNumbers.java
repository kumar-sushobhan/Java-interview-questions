package com.sushobhan;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {

    /**
     * Examples:
     * 14 = XIV
     * 79 = LXXIX
     * 225 = CCXXV
     * 845 = DCCCXLV
     * 2022 = MMXXII
     */
    public static void main(String[] args) {
        String romanNumber = "MMXXII";
        System.out.println("Roman Number : " + romanNumber + " is equal to : " + romanNumberToInt(romanNumber));
    }

    static int romanNumberToInt(String s) {
        int total = 0;
        char[] charArray = s.toCharArray();

        // Roman numbers hashmap
        Map<Character, Integer> romanMap = new HashMap<>();

        // Populating numbers hashmap
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Algorithm
        for (int i = 0; i < charArray.length; i++) {
            if (i == charArray.length - 1) {
                total = total + romanMap.get(charArray[i]);
            } else if (romanMap.get(charArray[i]) >= romanMap.get(charArray[i + 1])) {
                total = total + romanMap.get(charArray[i]);
            } else {
                total = total + (romanMap.get(charArray[i + 1]) - romanMap.get(charArray[i]));
                i++;
            }
        }
        return total;
    }
}
