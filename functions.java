package com.iflak;
import java.util.Scanner;

import static java.lang.Long.sum;

public class functions {
    public static void main(String[] args) {

        int ans=sum2();
        System.out.println("answer is:"+ans);
        sum();
    }

    static int sum2() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the values of a and b");
            int a, b, sum2;
            a = sc.nextInt();
            b = sc.nextInt();
            sum2 = a + b;
            return sum2;
         //   System.out.println("this will nevere excecute because it is after the return");

        }
    }
        static void sum() {
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the values of a and b");
                int a, b, sum;
                a = sc.nextInt();
                b = sc.nextInt();
                sum = a + b;
                System.out.println("the result is:" + sum);
            }
        }

    }

