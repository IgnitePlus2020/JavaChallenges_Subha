package com.tgt.igniteplus;
import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        double number,s;
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        number=in.nextDouble();
        s=Math.sqrt(number);
        if(s-Math.floor(s)==0)
            System.out.println("Given number is a perfect square");
        else
            System.out.println("Given number is not a perfect square");
    }
}

