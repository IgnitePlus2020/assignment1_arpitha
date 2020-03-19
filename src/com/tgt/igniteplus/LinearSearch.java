package com.tgt.igniteplus;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of list");
        int size=in.nextInt();
        int[] numlist=new int[size];
        System.out.println("Enter the elements in list");
        for(int i=0;i<size;i++)
            numlist[i]=in.nextInt();
        System.out.println("Enter key int to be searched");
        int key=in.nextInt();
        int position=10000;
        for(int i=0;i<size;i++){
            if(numlist[i]==key){
                position=i;
                break;
            }
        }
        if(position!=10000)
            System.out.println("the key is found in list at position:"+position);
        else
            System.out.println("the key is not found in the list");
        in.close();
    }
}
