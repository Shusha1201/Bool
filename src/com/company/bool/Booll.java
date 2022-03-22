package com.company.bool;

public class Booll {
    public static void main(String[] args) {
        //задача 5
        int a = 5, b=3;
        boolean b1=a>=0;
        boolean b2=b<-2;
        boolean b3 = b1 || b2;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        if (a>=0||b<-2)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
