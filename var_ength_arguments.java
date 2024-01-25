package com.iflak;

import java.util.Arrays;

public class var_ength_arguments {
    public static void main(String[] args) {
        fun(3,4,5,6,7,8,9,90,90);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
