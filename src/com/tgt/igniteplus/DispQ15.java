/*Assignment Q15: A program to display the number in following sequence.
1, 4, 9, 25, 36, 49 ..................N*/
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
        in.close();
    }
}
