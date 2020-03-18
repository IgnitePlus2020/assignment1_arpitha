package com.tgt.igniteplus;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=in.nextInt();
        int OddSum=0,EvenSum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0)
                EvenSum+=i;
            else
                OddSum+=i;
        }
        System.out.println("Odd sum="+OddSum+" "+"Even sum="+EvenSum);
        in.close();
    }
}
