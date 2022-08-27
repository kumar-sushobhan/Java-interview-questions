package com.sushobhan;

public class CheckPalindromeString {
    static boolean checkPalindromeString(String text) {
        for (int i = 0; i < (text.length()) / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindromeString("madam"));
        System.out.println(checkPalindromeString("sushobhan"));
    }
}
