package com.sushobhan.exam;

import java.util.Locale;
import java.util.ResourceBundle;

public class Seven {
    public static void main(String[] args) {
        Locale loc = new Locale("en", "UK");
        ResourceBundle msg7 = ResourceBundle.getBundle("MsgBundle", loc);
        System.out.format("%s, %s", msg7.getString("language"), msg7.getString("platform"));
    }
}
