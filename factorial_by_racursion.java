package com.iflak;

public class factorial_by_racursion {
    public static void main(String[] args) {
        System.out.println(fact(18));
    }
    static int fact(int n){
            //base condition
            if (n<=1) {
                return 1;
            }
            return n * fact(n - 1);

    }
}

