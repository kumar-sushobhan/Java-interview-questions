package com.sushobhan.exam;

import java.util.ArrayList;

public class TestGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> a = new ArrayList<>();
        a.add(new Apple());
        ArrayList b = a;
        ArrayList<Orange> c = (ArrayList<Orange>) b;
        c.add(new Orange());
        for(Object obj : b){
            System.out.println(obj);
        }
    }
}
