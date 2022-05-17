package com.company;
// find the root of integer value with using any math function
// ex.  input=5  output=2
// time complexity : O(n)
import java.util.Scanner;

public class Rootnode_Order_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for find root node :");
        int n = sc.nextInt();

       /* for(int i=n;i>0;i--)
        {
            if((i*i)<=n) // like 3*3 is not less than 5 so this int value is not print ,2*2 is less than 5 then root of 5 is
            {
                System.out.println(i);
                break;
            }
        }*/          //O(n)
        for(int i=(n/2);i>0;i--) //
        {
            if((i*i)<=n) // like 3*3 is not less than 5 so this int value is not print ,2*2 is less than 5 then root of 5 is
            {
                System.out.println(i);
                break;
            }
        }         //O(n)

    }
}
