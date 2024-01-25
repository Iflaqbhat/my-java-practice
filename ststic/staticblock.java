package com.iflak.ststic;

public class staticblock {
    static int a=5;
    static int b;
    // the static block will run for only one object..no matter how many objects we are going to create;
    static{
        System.out.println("hello this is a static block");
        b=a*7;

    }

    public static void main(String[] args) {
        staticblock sb=new staticblock();
        System.out.println(staticblock.a);
    }
}
