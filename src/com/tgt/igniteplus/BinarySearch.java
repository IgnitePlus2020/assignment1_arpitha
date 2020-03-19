//Assignment Q29:A program to find a number in a sorted array using Binary Search

package com.tgt.igniteplus;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of list");
        int size=in.nextInt();
        int[] numlist=new int[size];
        System.out.println("Enter the elements in list");
        for(int i=0;i<size;i++)
            numlist[i]=in.nextInt();
        int low=0,high=size-1;
        int mid;
        System.out.println("Enter key int to be searched");
        int key=in.nextInt();
        while(low<=high){
            mid=(low+high)/2;
            if(numlist[mid]==key){
                System.out.print("the key was found in the list at position:"+(mid+1));
                return;
            }
            else if(numlist[mid]>key){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        System.out.print("The key was not found in the list");
        in.close();
    }
}
