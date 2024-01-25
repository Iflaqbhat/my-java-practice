package com.iflak;
import java.util.Scanner;

import java.util.ArrayList;
public class araaaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arraylist
        //syntax>
        //we can change datatypes in<>
        ArrayList<Integer> list = new ArrayList<>(4);
        //working
//
//        list.add(33);
//        list.add(334);
//        list.add(332);
//        list.add(33211);
//        list.add(331);
//        System.out.println(list);
//        System.out.println(list.get(4));
//        boolean q=list.isEmpty();
//        System.out.println(q);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
