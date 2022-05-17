package com.company;

import java.util.Scanner;

public class Spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix");
        int n = sc.nextInt();
        int minrow=0,maxrow=n-1; // initialize row and column
        int mincol=0,maxcol=n-1;//lower limit

        int a[][]=new int[n][n];
        int val =1;
        int max = n*n;
        while(val<=max) {
            for (int i = mincol; i <=maxcol; i++) // first row
            {
                a[minrow][i] = val;
                        val++;
            }
            for (int i = minrow + 1; i <= maxrow; i++) {
                a[i][maxcol] = val;
                        val++;
            }
            for (int i = maxcol - 1; i >= mincol; i--) {
                a[maxrow][i] = val;
                val++;
            }
            for (int i = maxrow - 1; i > minrow; i--) {
                a[i][mincol] = val;
                        val++;
            }

            mincol++;
            minrow++;
            maxcol--;
            maxrow--;
        }

        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(a[i][j] + "  ");

            }
            System.out.println();
        }

    }
}
