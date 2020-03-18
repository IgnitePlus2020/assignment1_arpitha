package com.tgt.igniteplus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //swap two numbers
        int a=3,b=4,c=5;
        System.out.println("Swapping of two nos:");
        System.out.println("the numbers are:");
        System.out.println("a="+a+" b="+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping:");
        System.out.println("a="+a+" b="+b);
        System.out.println();
        //swapping of three numbers
        System.out.println("Swapping of three nos:");
        System.out.println("the numbers are:");
        System.out.println("a="+a+" b="+b+" c="+c);
        temp=a;
        a=b;
        int temp1=b;
        b=c;
        c=temp;
        System.out.println("after swapping:");
        System.out.println("a="+a+" b="+b+" c="+c);


    }
}
