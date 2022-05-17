package com.company;

import java.util.Scanner;

public class Quotient_Reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(); // divison product
        int b= sc.nextInt(); // divisor product
        int quotient=0;
        int dec=a;
        while(dec>1)
        {
            dec-=b;
            quotient++;
        }
        System.out.println("Quotient :" +quotient);
        int reminder= a - (quotient*b);
        System.out.println("remiender :" + reminder);
    }
}

