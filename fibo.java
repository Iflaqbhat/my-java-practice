package com.iflak;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibon(405));
    }
    static int fibon(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibon(n-1) + fibon(n-2);
    }
}
