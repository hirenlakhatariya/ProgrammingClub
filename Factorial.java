package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        int fact=1;
        for(int i=n-1;i>=0;i--)
        {
            fact+=(multiplication(i,fact));
        }
        System.out.println(fact);

    }
    public static int multiplication(int a,int b)
    {
        int sum=0;
        while(b>0)
        {
            sum+=a;
            b--;
        }
        return sum;
    }
}
