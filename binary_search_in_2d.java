package com.iflak;

import java.util.Arrays;

public class binary_search_in_2d {
    public static void main(String[] args) {
        int[][] matrix= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28,29,37,49},
                {33, 34, 38, 50}
                      };
       // System.out.println(arr.length);
        System.out.println(Arrays.toString(search(matrix, 50)));

    }
    static  int[] search(int[][] matrix,int target){
        int r=0;
        int c=matrix.length-1;
       // System.out.println(matrix.length);
        while(r<matrix.length  &&  c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return new int []{-1,-1};
    }
}
