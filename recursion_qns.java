package com.iflak;

public class recursion_qns {
    public static void main(String[] args) {
        fun(5);
    }
       public static void fun(int n) {
            if (n == 0) {
                // System.out.println(5);
                return;
            }

            fun(n-1);
            System.out.println(n);
        }

    public static void fun2(int n) {
        if (n == 0) {
           // System.out.println(5);
            return;
        }

        fun(n-1);
        System.out.println(n);
    }
    public static void funboth(int n) {
        if (n == 0) {
            // System.out.println(5);
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
}
