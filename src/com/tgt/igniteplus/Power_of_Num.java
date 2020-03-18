package com.tgt.igniteplus;

import java.util.Scanner;

public class Power_of_Num {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter X and n");
        int X=in.nextInt();
        int n=in.nextInt();
        System.out.print(X+"^"+n+"=");
        long result=1;
        while(n!=0){
            result*=X;;
            --n;
        }
        System.out.println(result);
    }
}
