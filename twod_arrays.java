package com.iflak;

import java.util.Arrays;
import java.util.Scanner;

public class twod_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[][] arr=new int[4][];
        //arr[1][1]=44;
        //
        // int[][] arr2= {
        //     {1,2,3},
        //   {4,5,6},
        // {7,8}
//        };
//        System.out.println(arr2[9][0]);

        int[][] arr3 = new int[3][3];
        System.out.println(arr3.length);
        //input
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = in.nextInt();
            }

        }
//        for (int row = 0; row < arr3.length; row++) {
//            for (int col = 0; col < arr3[row].length; col++) {
//
//                System.out.print(arr3[col][row]+" ");
//            }
//            System.out.println();
//        }
        for (int row=0;row< arr3.length;row++){
            System.out.println(Arrays.toString(arr3[row]));
        }
    }
}
