package com.iflak;

public class overloadingg {
    public static void main(String[] args) {
        fun(34);
        fun("hrt");

    }
    static void fun(int a){
        System.out.println("first");
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println("second");
        System.out.println(name);

    }
}
