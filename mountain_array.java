package com.iflak;

import javax.swing.*;

public class mountain_array {
    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5, 6};
        int target = 9;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i + 1] == target) {
                System.out.println(nums[i] + " " + nums[i + 1]);
            } else {
                System.out.println("false");
            }

        }

            }
        }


          


