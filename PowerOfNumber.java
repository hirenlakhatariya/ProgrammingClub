package com.company;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        System.out.println("Enter the power : ");
        int b = sc.nextInt();
        int sum = a;
        int increment = a;

            for(int j=1;j<b;j++)
            {
                for (int i = 1; i<a; i++) {
                    sum +=increment;

                }
                increment = sum;
            }




        System.out.println(sum);
    }
}


