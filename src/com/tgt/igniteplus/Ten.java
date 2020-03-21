package com.tgt.igniteplus;
import java.util.Scanner;
import java.io.*;
public class Ten {
    public static void main(String[] args) throws IOException,FileNotFoundException{

        FileOutputStream fos = new FileOutputStream("file2.txt",true);
        FileInputStream fis =new FileInputStream("file1.txt");
        int a;
        while((a=fis.read())!=-1)
            fos.write(a);
        fis.close();
        fos.close();
    }
}
