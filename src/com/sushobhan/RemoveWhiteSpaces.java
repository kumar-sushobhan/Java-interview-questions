package com.sushobhan;

public class RemoveWhiteSpaces {
    static String removeWhiteSpaces(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            if (!Character.isWhitespace(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces(" s us  ho  bha n "));
    }
}
