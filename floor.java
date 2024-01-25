package com.iflak;
// celingof a no==a number that is smallest greater to the target number;

    public class floor {
        public static void main(String[] args) {
            int arr[] = {2, 3, 4, 5, 6, 7, 8, 25};
            int target = 24;
            int ans = cealing(arr, target);
            System.out.println(ans);

        }

        //return the index
        //retuen -1 if it does not exist
        static int cealing(int[] arr, int target) {


            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                //find mid element
                int mid = (start + end) / 2;//might be possible value can be very large in some cases;
                //instead we can use start+(end - start)/2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
            return arr[end];

    }
}
