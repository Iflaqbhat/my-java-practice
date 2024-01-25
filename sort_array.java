package com.iflak;

import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {

        int[] arr={5, 3, 8, 2, 6, 11, 5, 9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==17) {
                    System.out.println(arr[i] + " " + arr[j]);
                }

            }
        }
    }
}
