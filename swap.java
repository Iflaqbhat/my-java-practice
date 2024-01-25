package com.iflak;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=78;
        swap(a,b);
        System.out.println(a+" "+b);
       // System.out.println("the value of a is:"+a +" "+"the value of b is:"+b);
    }
    static void swap(int nu,int nuy){
        int temp;
        temp=nu;
        nu=nuy;
        nuy=temp;
        System.out.println(nu);
        System.out.println(nuy);


    }
}
