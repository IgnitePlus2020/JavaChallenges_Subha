package com.tgt.igniteplus;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        int n,i,sum=0;float avg;
        System.out.println("Enter the number of elements in the array: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {   arr[i]= in.nextInt();
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.println("Average of the array elements: "+avg);

    }
}
