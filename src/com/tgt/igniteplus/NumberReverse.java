/*Assignment Q9:A program to reverse the number.*/
package com.tgt.igniteplus;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int n=in.nextInt();
        int rev = 0,digit;
        while(n != 0)
        {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }
        System.out.println("reversed number is: "+rev);
        in.close();
    }
}
