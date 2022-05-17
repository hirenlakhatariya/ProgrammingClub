package com.company;

import java.util.Scanner;

// 2. print the febonacci series starting from n number and print 5 elements
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n1=0,n2=1;


        int n4; // store value

        System.out.println("Enter the number for print fibonacci series");
        int n = sc.nextInt();
        int n6;
        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            n6 = n1+n2;

            n1=n2;
            n2=n6;
            if(n6>n)
            {
                n4 = n6;
                break;
            }
        }
        System.out.println(n2);
        for(int i=0;i<4;i++)
        {
            int n5= n2 + n1;
            System.out.println(n5);
            n1=n2;
            n2=n5;
        }
    }
}
