package com.iflak;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int a=sc.nextInt();
        while (b<a){
            System.out.println(b);
           b= b+2;
        }
    }
}