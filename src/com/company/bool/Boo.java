package com.company.bool;

public class Boo {
    public static void main(String[] args) {


    // задача 18 - Проверить истинность высказывания: «Среди трех данных целых
    //чисел есть хотя бы одна пара совпадающих»
    int a=4, b=2, c=1;
    boolean b1=a==b;
    boolean b2=b==c;
    boolean b3=a==c;
    boolean b4=b1 || b2 || b3;
        System.out.println(b4);
        System.out.println(a==b||b==c||a==c);

}
}