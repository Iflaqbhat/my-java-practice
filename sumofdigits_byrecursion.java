package com.iflak;

public class SumOfDigitsByRecursion {
    public static void main(String[] args) {
        // Example usage: finding the sum of digits of the number 3214
        int result = sumOfDigits(3214);
        System.out.println("Sum of digits: " + result);
    }

    /**
     * Recursively calculates the sum of digits in a given number.
     *
     * @return The sum of digits of the given number.
     */
    static int sumOfDigits(int n) {
        // Base case: If the number is 0, the sum is 0.
        if (n == 0) {
            return 0;
        }

        // Recursive case: Return the last digit plus the sum of digits of the remaining number.
        return (n % 10) + sumOfDigits(n / 10);
    }
}
