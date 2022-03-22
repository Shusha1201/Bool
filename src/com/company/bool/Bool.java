package com.company.bool;

public class Bool {
    public static void main(String[] args) {
        //задача 10 только одно из чисел нечетное
        int a =4, b=3;
        boolean b1=a%2==1; //а-нечетное
        boolean b2=b%2==1;  //b-нечетное
        boolean b3=(b1 && !b2) || (!b1 && b2);
        System.out.println(b3);
    }
}
