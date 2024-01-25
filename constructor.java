package com.iflak;

public class constructor {
    private int id;
    private String str;
    public constructor(String sex,int myid) {
        id=myid;
    }

    public static void main(String[] args) {
        constructor hipoe=new constructor("yrtkwerthi",65);
        ;

        System.out.println(hipoe.id);
        System.out.println(hipoe.str);
    }
}
