package com.iflak;

public class arrayqns {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7};
        int target = 8;
        int[] result = sol(arr, target);

        if (result != null) {
            System.out.println("Pair found: " + result[0] + " " + result[1]);
        } else {
            System.out.println("Pair not found");
        }
    }

    public static int[] sol(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }

        // Return null if no pair is found
        return null;
    }
}
