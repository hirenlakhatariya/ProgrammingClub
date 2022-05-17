package com.company;

import java.util.Scanner;

public class binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        long rem[]=new long[100];
        int i=0;

        while(a!=0)
        {
           rem[i]=a%2;
           a=a/2;
           i++;
        }

for(int j=i-1;j>=0;j--) {
    System.out.print(" "+rem[j]);
}
    }
}
