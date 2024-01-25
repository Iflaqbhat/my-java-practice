package com.iflak;

public class recursion_concept {
    public static void main(String[] args) {
        fun(5);

    }
    public static void fun(int n) {
        if (n == 0) {
            // System.out.println(5);
            return;
        }
      //  fun(n--);it will give error 35:27 because it will keep on repeating the value of the 5;
        //
        fun(--n);
        System.out.println(n);
    }

}
