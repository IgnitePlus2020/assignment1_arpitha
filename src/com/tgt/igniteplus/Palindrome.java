//Assignment Q26:A program to check if given string is palindrome or not

package com.tgt.igniteplus;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        System.out.println("Enter string :");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed string is:");
        System.out.println(reverse);
        if(str.equals(reverse)) {
            System.out.println("Since the given string and reverse string is same");
            System.out.println("the string is palindrome");
        }
        else
            System.out.println("the string is not palindrome");
        read.close();
    }
}
