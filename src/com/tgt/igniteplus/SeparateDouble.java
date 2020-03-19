//Assignment Q6:A program to separate whole number and fraction from double and display

package com.tgt.igniteplus;

import java.util.Scanner;

public class SeparateDouble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        System.out.println("Enter the number to split: ");
        n = in.nextDouble();
        int whole = (int)n;
        float fraction = (float)n - whole;
        System.out.println("Whole part:" + whole +"\nFractional part:"+fraction);
        in.close();
    }
}
