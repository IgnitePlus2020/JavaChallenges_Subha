package com.tgt.igniteplus;
import java.util.Scanner;
public class Nineteen {
    public static void main(String[] args) {
        int a,flag=0;
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        while(a!=1)
        {
            if(a%2==0)
                a/=2;
            else if(a%3==0)
                a/=3;
            else if(a%5==0)
                a/=5;
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("It is an ugly number");
        else
            System.out.println("It is not an ugly number");
    }
}
