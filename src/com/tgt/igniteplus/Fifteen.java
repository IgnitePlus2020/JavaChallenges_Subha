package com.tgt.igniteplus;

public class Fifteen {
    public static void main(String[] args) {
        String a="GOD";
        int n=a.length();
        System.out.println("Permutations of GOD are :");
        p(a,0,n-1);

    }

    static void p(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                p(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
