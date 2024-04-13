package com.sushobhan.exam;

import java.lang.reflect.Constructor;

public class Reflect8 extends Base8{
    public Reflect8(){

    }
    private Reflect8(int i) {

    }
    static Constructor c1,c2;

    public static void main(String[] args) {
        Reflect8 r8= new Reflect8();
        try{
            c1 =r8.getClass().getConstructor();
        }catch (Exception e){

        }
        try{
            c2 =r8.getClass().getConstructor(int.class);
        }catch (Exception e){

        }
        System.out.printf("%s, %s", c1,c2);
    }
}
