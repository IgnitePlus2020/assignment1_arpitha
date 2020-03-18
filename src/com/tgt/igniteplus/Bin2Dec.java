package com.tgt.igniteplus;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter binary number");
        int binnum=in.nextInt();
        int deci=0,p=0;
        while(true){
            if(binnum==0){
                break;
            }
            else{
                int temp=binnum%10;
                deci+=temp*Math.pow(2,p);
                binnum=binnum/10;
                p++;
            }
        }
        System.out.println(deci);
    }
}
