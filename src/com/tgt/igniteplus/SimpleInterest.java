//Assignment Q3:A program to calculate Simple Interest

package com.tgt.igniteplus;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        // write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("enter principal amount in rupees:");
        double p=in.nextDouble();
        System.out.println("enter time in years:");
        int t=in.nextInt();
        System.out.println("enter interest rate ");
        int r=in.nextInt();
        System.out.println("Calculated Simple interest is:"+((p*t*r)/100));
        in.close();
    }
}
