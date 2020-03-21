package com.tgt.igniteplus;
import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args) {
        int a,b,c,large;
        System.out.println("Enter a,b,c: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        large=a>(b>c?b:c)?a:(b>c?b:c);
        System.out.println("Greatest number is "+large);
    }
}
