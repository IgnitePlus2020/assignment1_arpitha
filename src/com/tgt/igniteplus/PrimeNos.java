package com.tgt.igniteplus;

import java.util.Scanner;

public class PrimeNos {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter values of n & m for the range");
        int n=in.nextInt();
        int m=in.nextInt();
        int flag=0;
        for(int i=n;i<=m;i++){
            for(int j=2;j<i;j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
                else {
                    flag = 1;
                }
            }
            if(flag==1) {
                System.out.println(i + " ");
            }
        }
    }
}
