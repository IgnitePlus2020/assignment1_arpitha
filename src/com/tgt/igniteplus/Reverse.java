//Assignment Q25:A program to reverse a given string

package com.tgt.igniteplus;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.next();
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
        read.close();
    }
}
