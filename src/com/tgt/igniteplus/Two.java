package com.tgt.igniteplus;

import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        float r,h,v;
        System.out.println("Enter radius of cylinder: ");
        Scanner in=new Scanner(System.in);
        r=in.nextFloat();
        System.out.println("Enter height of cylinder: ");
        h=in.nextFloat();
        v=(float)Math.PI*r*r*h;
        System.out.println("Volume of the  cylinder: "+v +" cubic units");
    }
}
