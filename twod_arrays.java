package com.iflak;

import java.util.Arrays;
import java.util.Scanner;

public class twod_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr3 = new int[3][3];

        // Input
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = in.nextInt();
            }
        }

        // Print original array
        System.out.println("Original Array:");
        for (int row = 0; row < arr3.length; row++) {
            System.out.println(Arrays.toString(arr3[row]));
        }

        // Transpose the array
        int[][] transposedArray = new int[arr3[0].length][arr3.length];
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                transposedArray[col][row] = arr3[row][col];
            }
        }

        // Print transposed array
        System.out.println("Transposed Array:");
        for (int row = 0; row < transposedArray.length; row++) {
            System.out.println(Arrays.toString(transposedArray[row]));
        }
    }
}
