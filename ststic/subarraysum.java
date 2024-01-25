package com.iflak.ststic;

public class subarraysum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        findsum(arr, 12);
    }

    public static void findsum(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            int newsum = arr[i];
            if (newsum== sum) {
                System.out.println(i);
                return;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    newsum += arr[j];
                    if (newsum == sum) {
                        System.out.println("sum found between the indexes" + i + " " + j);
                        return;
                    }

                }
            }
        }
        System.out.println("no substring found");
        return;
    }
}

