package com.iflak;
import java.util.Scanner;

public class functions_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  vALUES");

//       int a = sc.nextInt();
        //int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max=maximum(a, b, c);
//        System.out.println(max);
//        int min=minimum(a,b,c);
//        System.out.println(min);
//
//    }
//
//    static int maximum(int a, int b, int c) {
//        if (a > b && a > c) {
//            System.out.println("a is greater:" + a);
//            return a;
//        } else if (b > a && b > c) {
//            System.out.println("b is greater:" + b);
//            return b;
//
//        } else {
//            System.out.println("c is the greatest:" + c);
//            return c;
//        }
//    }
//
//    static int minimum(int a, int b, int c) {
//       // int min=a;
//        if (a < b && a < c) {
//            System.out.println("a is minimum:" + a);
//            return a;
//        } else if (b < a && b < c) {
//            System.out.println("b is minimum:" + b);
//            return b;
//
//        }
//        else {
//            System.out.println("c is the minimum:" + c);
//            return c;
//        }
//        int a = sc.nextInt();
//        even_odd(a);
//
//    }
//    static void even_odd(int a){
//        if(a%2==0) {
//            System.out.println("it is even no:");
//        }
//        else{
//            System.out.println("it is odd no:");
//        }

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int ans=sum(a,b);
//        System.out.println("the sum is"+ans);
//    }
//    static int sum(int a,int b){
//        int sum=a+b;
//        return sum;
//
//        int num= sc.nextInt();
//        //int remainder=0;
//        float ans=palindrome(num);
//        System.out.println(ans);
//    }
//    static int palindrome(int num){
//        int pal;
//        int remainder;
//        int reversenum=0;
//            remainder = num / 10;
//            reversenum=(reversenum*10)+remainder;
//            System.out.println(reversenum);
//        System.out.println(reversenum);
//        return reversenum;
//        int n = sc.nextInt();
//        //int count = 0;
//        isprime(n);
//    }
//
//    static void isprime(int n) {
//        int count = 0;
//     //   while (true) {
//            for (int i = 1; i <= n; i++) {
//                if (n % i == 0)
//                    count++;
//            }
//            if (count == 2) {
//                System.out.println("prime");
//            } else {
//                System.out.println("not prime");
//
//            }
       // while (true) {
            int n = sc.nextInt();
            ;
            int ans = sum(n);
            System.out.println(ans);
        }
        static int sum ( int n){
            //  while (true){
            int summ = 0;
            for (int i = 0; i <= n; i++) {
                summ = summ + i;
            }
            return summ;
        }
    }









