package com.iflak.ststic;

import java.util.Arrays;

public class longest_common_prrefix {
    public static void main(String[] args) {
        String str[] = {"flower", "float", "flight"};
        System.out.println(longestcommonprrefix(str));
        
    }

    public static String longestcommonprrefix(String[] str) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];
        int index = 0;
        while (index < s1.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : s1.substring(0, index);
    }
}






