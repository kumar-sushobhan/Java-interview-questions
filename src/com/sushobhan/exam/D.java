package com.sushobhan.exam;

import java.util.prefs.Preferences;

public class D {
    public static void main(String[] args) {
        System.out.println("hello");
        E e = new E();
        Preferences rootNode = Preferences.userRoot().node("Root");
        try{
            Preferences node1 = rootNode.node("Node 1");
            rootNode.addNodeChangeListener(e);
            Preferences node2 = rootNode.node("Node 2");
            node1.put("location", "Bangalore");
            node1.put("country", "India");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
