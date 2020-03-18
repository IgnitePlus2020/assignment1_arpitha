/*Assignment Q11:A program to display the number in following sequence.
4, 16, 36, 64.......N*/
package com.tgt.igniteplus;

import java.util.Scanner;

public class DispQ11 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N=in.nextInt();
        int i=1,ans=0,j=1;
        for(i=1;i<N;i++){
            ans=4 * i * j;
            System.out.print(" "+ans+" ");
            if(ans>=N)
                break;
            j++;
        }
        in.close();
    }
}
