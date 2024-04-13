package com.sushobhan.exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public final static String PATTERN = "\\w+";
    public final static String INPUT_STRING = "Java is stringly typed language";
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(INPUT_STRING);
        boolean b = false;
        while(b= matcher.find()){
            System.out.print(matcher.group());
        }
    }
}
