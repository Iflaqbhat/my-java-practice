package com.iflak;

import java.util.Arrays;

public class cyclic_sort {
        public static void main(String[] args) {
            int[] arr={1,4,2,3,9,5,7,6,8};
            sort(arr);
            System.out.println(Arrays.toString(arr));

        }
        static void sort(int[] arr){
            int i=0;
            while(i<arr.length) {
                int correct = arr[i] - 1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i ,correct);
                }else {
                    i++;
                }
            }

        }
        static void swap(int [] arr,int first,int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

        }
    }

