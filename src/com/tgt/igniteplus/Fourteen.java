package com.tgt.igniteplus;
import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args) {
        String a, b;int l1,l2,i,j,flag=0;
        System.out.println("Enter first string: ");
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        System.out.println("Enter second string: ");
        b = in.nextLine();
        l1=a.length();
        l2=b.length();
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        for(i=0;i<=l1-l2;i++)
        {
            for(j=0;j<l2;j++)
                if(a1[i+j]!=b1[j])
                    break;
            if(j==l2)
            {    flag=1;
                 break;
            }

        }
        if(flag==0)
            System.out.println("first string does not contain second string");
        else
            System.out.println("first string contains second string");
    }
}
