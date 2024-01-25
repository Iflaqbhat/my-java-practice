package com.iflak;

public class recursion {
    public static void main(String[] args) {
        mess();

    }
    static void mess(){
        System.out.println("hello");
        messa();
    }
    static void messa(){
        System.out.println("hello");
        messg();
    }
    static void messg(){
        System.out.println("hello");
        message();
    }
    static void message(){
        System.out.println("hello");
    }

}
