//Assignment Q19:A program to convert Decimal number to Binary Number

package com.tgt.igniteplus;

import java.util.Scanner;

public class Deci2Bin {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number num");
        int num=in.nextInt();
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1; i >= 0;i--) {
            System.out.print(binary[i]);
        in.close();
        }
    }
}
