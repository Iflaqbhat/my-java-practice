package com.iflak;

public class recursion_2 {
    public static void main(String[] args) {
      rec(1);
    }

    static void rec(int n){
        if(n==4){
            return ;
        }
        System.out.println(n);
        rec(n+1);

    }

}
