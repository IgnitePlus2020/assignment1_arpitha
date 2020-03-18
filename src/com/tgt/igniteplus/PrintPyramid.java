package com.tgt.igniteplus;

import java.util.Scanner;

public class PrintPyramid {
    public static void main(String[] args) {
        // write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        /*to print pyramid
         *
         * *
         * * *
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" * ");
            System.out.println();
        }
        System.out.println();
        /* to print pyramid
         *
         * *
         * * *
         */
        for(int i=0;i<n;i++){
            for(int j=n-i;j>1;j--) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}
