package com.iflak;
import java.util.Arrays;
import java.util.Scanner;

import static com.iflak.recursion.message;

public class arrays {
    public static void main(String[] args) {

        //syntax
        //datatype[] variable name=new datatype[size];
        //store 5 roll numbers;
      //  int[] rols= new int[4];
        //rols[0]=9;
        Scanner in=new Scanner(System.in);
        int  arr[]=new int[5];
        arr[0]=99;
        arr[1]=91;
        arr[2]=92;
        arr[3]=93;
        arr[4]=96;
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=in.nextInt();
          //
        //    System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

    }//
}
