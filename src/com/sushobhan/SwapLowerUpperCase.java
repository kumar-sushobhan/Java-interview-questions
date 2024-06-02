package com.sushobhan;

import java.util.stream.Collectors;

public class SwapLowerUpperCase {
    public static void main(String[] args) {
        System.out.println(swapLowerUpperCase("sUShOBhAn"));
        System.out.println(swapLU("sUShOBhAn"));
        System.out.println(swapLU2("sUShOBhAn"));
    }

    static String swapLowerUpperCase(String text) {
        return text
                .chars()
                .mapToObj(i -> (char) i)
                .map(c -> String.valueOf(flipCase(c)))
                .collect(Collectors.joining());
    }

    static char flipCase(char ch) {
        if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch);
        } else {
            return Character.toUpperCase(ch);
        }
    }

    static String swapLU(String text) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                stringBuffer.replace(i, i + 1, Character.toUpperCase(c) + "");
            } else stringBuffer.replace(i, i + 1, Character.toLowerCase(c) + "");
        }
        return stringBuffer.toString();
    }

    static String swapLU2(String text) {
        StringBuilder stringBuilder = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else c = Character.toLowerCase(c);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
