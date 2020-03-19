/*Assignment Q14:A program to display the number in following sequence.
1,4,7,12,23.......N*/

package com.tgt.igniteplus;

import java.util.Scanner;

public class DispQ14 {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        int a = 1, b = 4, c=7;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= n; i++) {
            int next = a + b + c;
            System.out.print(next+" ");
            a = b;
            b = c;
            c = next;
        }
        in.close();
    }
}
