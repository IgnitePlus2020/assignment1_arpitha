package com.tgt.igniteplus;

import java.util.Scanner;

public class DispQ12 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of N");
        int N=in.nextInt();
        for(int i=1;i<=N;i++){
            if(i%2==0)
                System.out.print(i+" ");
            else
                System.out.print(-i+" ");
        }
    }
}
