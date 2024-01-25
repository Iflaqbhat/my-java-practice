package com.iflak;

public class operatop_questions {
    public static void main(String[] args) {
//        int n=67;
//        System.out.println(isodd(n));
//    }
//    static boolean isodd(int n){
//        if((n&1)==1){
//            return true;
//        }
//        else{
//            return false;
//        }b
        int[] arr={2,3,4,5,3,2,4};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
