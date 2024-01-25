package com.iflak;

public class binserachdecendingord {
    public static void main(String[] args) {
        int arr[]={100,33,22,12,9,8,7,5,4,3,2};
        int target=33;
        int ans=binarysearch(arr,target);
        System.out.println(ans);

    }
    //return the index
    //retuen -1 if it does not exist
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            //find mid element
            int mid = (start + end) / 2;//might be possible value can be very large in some cases;
            //instead we can use start+(end - start)/2;
            if (target<arr[mid]){
                start=mid+1;

            } else if (target>arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

}
