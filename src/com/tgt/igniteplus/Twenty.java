package com.tgt.igniteplus;
import java.util.Scanner;
public class Twenty {
    public static void main(String[] args) {
        String s="I am always ready to learn although I do not always like being taught.";
        char[] arr=s.toCharArray();
        System.out.println("The given string in which \'a\' is replaced with \'$\' is ");
        int len=s.length();
        for(int i=0;i<len;i++)
            if(arr[i]=='a')
                arr[i]='$';
        String s1=String.valueOf(arr);
        System.out.println(s1);
    }
}
