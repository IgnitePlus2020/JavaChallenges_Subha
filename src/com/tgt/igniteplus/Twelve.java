package com.tgt.igniteplus;
import java.util.Scanner;
public class Twelve {
    public static void main(String[] args) {
        String a,b ,c;
        System.out.println("Enter first string: ");
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        System.out.println("Enter second string: ");
        b = in.nextLine();
        c=a.concat(b);
        System.out.println("String after concatenation: "+c);
    }
}
