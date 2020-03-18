/*Assignment Q7:A Program to find the largest and second largest of 3 numbers.*/
package com.tgt.igniteplus;

public class Largestofthree {
    public static void main(String[] args) {
        // write your code here
        int a=1,b=5,c=3;
        if(a>b&&a>c)
            System.out.print(a + " is the largest of 3 numbers");
        else if(b>c)
            System.out.print(b + " is the largest of 3 numbers");
        else
            System.out.print(c + " is the largest of 3 numbers");
    }
}
