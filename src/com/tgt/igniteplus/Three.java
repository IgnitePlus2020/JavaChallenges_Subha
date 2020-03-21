package com.tgt.igniteplus;

public class Three {
    public static void main(String[] args) {
        float discount, sp;
        discount = (float)0.12 * 50;//12% of 50
        sp = 50 - discount;//sp=cp-discount
        System.out.println("Discount = " + discount + "$");
        System.out.println("Selling price = " + sp + "$");
    }

}
