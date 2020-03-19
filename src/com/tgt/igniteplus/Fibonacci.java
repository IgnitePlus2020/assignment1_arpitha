//Assignment Q22:A program to print Fibonacci Series upto N

package com.tgt.igniteplus;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int n1=1;
        int n2=1,n=0;
        System.out.println("Fibonacci Series is:");
        System.out.print(n1+" "+n2+" ");
        do{
            n=n1+n2;
            System.out.print(n+" ");
            n1=n2;
            n2=n;
        }while(n1+n2<=N);
        in.close();
    }
}
