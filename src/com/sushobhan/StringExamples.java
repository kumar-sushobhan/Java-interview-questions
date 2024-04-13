package com.sushobhan;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = new String("sushobhan");
        String s2 = "sushobhan";
        System.out.println(s1==s2);
        System.out.println(s1.intern().hashCode() == s2.hashCode());
    }
}
