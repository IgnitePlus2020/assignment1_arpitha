package com.tgt.igniteplus;

import java.util.Scanner;

public class DispQ15 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter N");
        int N=in.nextInt();
        int ans=1,i=1;
        while(ans<=N) {
            System.out.print(ans+" ");
            i++;
            ans=(int)Math.pow(i,2);

        }
    }
}
