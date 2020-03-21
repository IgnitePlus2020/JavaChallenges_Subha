package com.tgt.igniteplus;
import java.util.Scanner;
import java.io.*;
public class Eight {
    public static void main(String[] args) {
        boolean res;
        File f=new File("C:\\Users\\05meg\\IdeaProjects\\Challenges\\file1.txt");
        try{
            res=f.createNewFile();
            if(res)
            {
                System.out.println("File created at location "+f.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exists at location "+f.getCanonicalPath());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
