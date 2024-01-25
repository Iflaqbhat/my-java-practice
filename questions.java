package com.iflak;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //    int a= sc.nextInt();
//       int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a>b && a>c){
//            System.out.println("a is the largest");
//        }else if(b>a && b>c){
//            System.out.println("b is greater");
//        }else{
//            System.out.println("c is the greater" );
        //      }/
//          String word="       tkmoc    ";
//        System.out.println(word.trim());
//        System.out.println(word.charAt(0));
//
        //fibonaCCI NOS
//   /     int n=sc.nextInt();
//        int p=0;
//        int q=1;
//        int count=2;
//        while(count<=n){
//
//
//           int n=6676766;
//
//        int count=0;
//        while(n>0){
//            int rem=n%10;
//            if(rem==5){
//                count++;
//            }
//        n=n/10;
//        }
//        System.out.println(count);
        //reverse a number:;
//        int n = 6747435;
//        int result = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            n = n / 10;
//            result = result * 10 + rem;
//        }
//        System.out.println(result);
        
        
//        calculator program;;
        
        int ans=0;
        while(true){
            System.out.println("enter the operation");
            char op=sc.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' ||op=='/') {
                System.out.println("enter the number:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                else if (op == '-') {
                    ans = num1 - num2;
                }
                else if (op == '*') {
                    ans = num1 * num2;
                }
                }else if (op=='/'){
                int num;


            }
        }
    }
}
