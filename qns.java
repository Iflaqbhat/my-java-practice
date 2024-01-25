package com.iflak;

import java.util.Arrays;

public class qns {
    public static void main(String[] args) {
        int num[] = {18, 12, 9, 14, 77, 50};
        //System.out.println(arr.index);
        int target = 9;
        int ans = linearsearch(num, target);
        System.out.println(ans);
    }

    static int linearsearch(int arr[],int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
          //int element = arr[index];
            if(arr[index]==target){
            return index;
            //  System.out.println(Arrays.stream(arr).max());
        }
    }
    return -1;

}

}