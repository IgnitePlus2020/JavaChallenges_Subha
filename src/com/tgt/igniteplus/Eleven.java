package com.tgt.igniteplus;
import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        String s,upperS;
        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        upperS=s.toUpperCase();
        System.out.println("String in uppercase : "+upperS);
    }
}
