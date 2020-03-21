package com.tgt.igniteplus;
import java.util.Scanner;
public class Sixteen {
    public static void main(String[] args) {
        String a;
        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        int count[]=new int[256];
        for(int i=0;i<a.length();i++)
            count[a.charAt(i)]++;
        System.out.printf("character\t\tcount\n.................................................................\n");
        for(int j=0;j<256;j++)
            if(count[j]>1)
                System.out.printf("%c\t\t\t \t%d \n", j,  count[j]);
    }
}
