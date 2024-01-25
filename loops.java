package com.iflak;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i+=4) {
            System.out.println("hello world");
        }
            for(int j=0;j<n;j+=3){
            System.out.println(j);
        }
    }
}
