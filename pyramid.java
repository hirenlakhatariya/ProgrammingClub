package com.company;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int i, j;
        int number =1;
        int num = 1;
        int x=1;
        for (i =0; i<=n; i++) {

            for(j=(n-i+1);j>=0;j--)
            {
                System.out.print("  " +
                        " ");
            }
            for (int k=0;k<=i;k++)
            {
               if(k==0 || i==0)
               {
                  x=1;
               }
               else
               {
                   x= x* (i-k+1)/k;

               }
                System.out.print("     "+x);
            }
            System.out.println();
        }


    }
}