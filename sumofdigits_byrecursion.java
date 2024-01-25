package com.iflak;

public class sumofdigits_byrecursion {
    public static void main(String[] args) {
      int ans=  sumofdigits(3214);
        System.out.println(ans);
    }
   static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumofdigits(n/10);
   }
}
