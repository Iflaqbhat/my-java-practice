package com.iflak;
import java.util.Scanner;

public class intermediate_level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg = 0;
       int count = 0;
       int sum=0;
       int a=sc.nextInt();

           for (int i = 0; i < a; i++) {
               sum = a + sum;
           }
           avg = sum / a;
           System.out.println(avg);




    }
}
