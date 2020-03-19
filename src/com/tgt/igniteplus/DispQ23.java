/*Assignment Q23:A program to display the number in following sequence.
1,-2,4,-6,7,-10,10,-14.......N*/

package com.tgt.igniteplus;

import java.util.Scanner;

public class DispQ23 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        int a = 1, b = -2;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(a + "\t");
                a = a + 3;
            } else {
                System.out.print(b + "\t");
                b = b - 4;
            }
        }
        in.close();
    }
}
