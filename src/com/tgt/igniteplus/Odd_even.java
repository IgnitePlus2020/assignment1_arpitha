package com.tgt.igniteplus;
import java.util.Scanner;
public class Odd_even {
    public static void main(String[] srgs){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        if(n%2==0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
        in.close();
    }
}
