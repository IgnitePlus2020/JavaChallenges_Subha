package com.tgt.igniteplus;
import java.util.Scanner;
import java.io.*;
public class Nine {
    public static void main(String[] args) {
       try {
           String fname, content;
           System.out.println("Enter the file name: ");
           Scanner in = new Scanner(System.in);
           fname = in.nextLine();
           FileOutputStream fos = new FileOutputStream(fname, true);
           System.out.println("Enter the content of the file:");
           content = in.nextLine();
           byte[] b = content.getBytes();
           fos.write(b);
           fos.close();
       }
       catch(Exception e){
           e.printStackTrace();
       }

    }
}
