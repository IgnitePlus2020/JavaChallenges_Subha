package com.tgt.igniteplus;
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year: ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if(year%400==0 || ( year%4==0 && year%100!=0))
            System.out.println(year+" is a leap Year");
        else
            System.out.println(year + " is not a leap Year");
    }
}
