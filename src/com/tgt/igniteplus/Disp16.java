/*Assignment Q16:A program to display the number in following sequence.
1,5,13,29,49,77.......N*/

package com.tgt.igniteplus;

import java.util.Scanner;

public class Disp16 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.println("Series=");
        int i = 1, j = 1;
        if (n > 0) {
            while (i <= n) {
                if (j % 3 != 0) {
                    System.out.print(i + " ");
                    i = i + 4 * j;
                }
                j++;
            }
        }
        in.close();
    }
}
