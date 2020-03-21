package com.tgt.igniteplus;
import java.util.Scanner;
public class Thirteen {
    public static void main(String[] args) {
        String a;int count=0;
        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)==' ')
                count++;
        System.out.println("Number of words in the string: "+(count+1));
    }
}
