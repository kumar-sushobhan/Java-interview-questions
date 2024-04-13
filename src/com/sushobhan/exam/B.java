package com.sushobhan.exam;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        System.out.println("hello");
        boolean b;
        String s, found="";
        Scanner s1= new Scanner("hello:java:world");
        s1.useDelimiter(":");
        while (s1.hasNext()){
            s=s1.next();
            found+=s;
        }
        System.out.println(found);
    }
}
