package com.tgt.igniteplus;
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        char ch; int ascii;
        System.out.println("Enter a character: ");
        Scanner in = new Scanner(System.in);
        ch = in.next().charAt(0);
        ascii=ch;
        System.out.println("ASCII value of the character "+ch+" is "+ascii);

    }
}
