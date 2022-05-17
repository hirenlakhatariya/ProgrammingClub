package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        int b=a/2;
        int c = 2*b;

        if(c<a)
        {
           System.out.println("odd");

        }
        else {
            System.out.println("even");
        }
    }
}
