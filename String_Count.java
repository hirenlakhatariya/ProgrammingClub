package com.company;

import java.util.Scanner;

public class String_Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter String :");
        String s = sc.nextLine();
        int word=1,cnum=0,a=0;

        s=s.trim();

        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                cnum++;
            }
            else if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                ++word;
            }


            else if(s.charAt(i)!=' ')
            {
                a++;
            }

        }
        System.out.println("woerds are : " + word);
        System.out.println("Digits are : "+ cnum );
        System.out.println("Character are : " + a);
    }
}
