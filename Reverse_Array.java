package com.company;
// 1. wap a program to reverse in same array without creating new array
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] a = {8,6,4,3};
        int i=0,j=a.length-1;
        int temp;
        while(i<j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;

        }
        for(j=0;j<=a.length-1;j++)
        {
            System.out.println(a[j]);
        }


    }
}
