package com.sushobhan;

public class StringLearn {
    public static void main(String[] args) {
        String str = "Hello !!! this is mu value .$12333344*";
        String newString= str.replaceAll("[^a-zA-Z0-9\\s.]","");
        System.out.println(newString);
    }
}
