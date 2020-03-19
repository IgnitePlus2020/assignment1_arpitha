//Assignment Q27:A program to check Armstrong Number

package com.tgt.igniteplus;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int number=in.nextInt();
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        in.close();
    }
}
