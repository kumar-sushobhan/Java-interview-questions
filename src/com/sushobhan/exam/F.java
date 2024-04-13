package com.sushobhan.exam;

import java.net.MalformedURLException;
import java.net.URL;

public class F {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println("hello");
        URL urlObject = new URL("http://foo.test.com/8080/documents/books/primer"+ "/content.html?name=Socket#Overview");
        System.out.format("%s,%s", urlObject.getQuery(), urlObject.getRef());


    }
}
