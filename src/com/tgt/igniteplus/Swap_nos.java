/*Assignment Q4:A program to swap 2 numbers and to swap 3 numbers.*/
package com.tgt.igniteplus;

import java.util.Scanner;

public class Swap_nos {

    public static void main(String[] args) {
        // write your code here
        Scanner in=new Scanner(System.in);
        //swap two numbers
        System.out.println("enter values for a,b");
        int a =in.nextInt();
        int b=in.nextInt();
        System.out.println("Swapping of two nos:");
        System.out.println("the numbers are:");
        System.out.println("a=" + a + " b=" + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping:");
        System.out.println("a=" + a + " b=" + b);
        System.out.println();
        //swapping of three numbers
        System.out.println("Swapping of three nos:");
        System.out.println("enter values of a,b,c");
        a=in.nextInt();
        b=in.nextInt();
        int c=in.nextInt();
        System.out.println("the numbers are:");
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        temp = a;
        a = b;
        int temp1 = b;
        b = c;
        c = temp;
        System.out.println("after swapping:");
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        in.close();
    }
}