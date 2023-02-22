package week1;

import java.util.Scanner;

public class Q5 {
    static Scanner input = new Scanner(System.in);

    static void enter(int[][] arr, int n)
    {
        System.out.println("Enter matrix: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                arr[i][j] = input.nextInt();
        }
    }

    static void disp(int[][] arr, int n)
    {
        System.out.println("Matrix: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the size: ");
        int n = input.nextInt();

        int m1[][] = new int[n][n];
        int m2[][] = new int[n][n];

        enter(m1, n);
        enter(m2, n);
        
        int m3[][] = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                m3[i][j] = m1[i][j] + m2[i][j];
        }
        
        disp(m1, n);
        disp(m2, n);
        disp(m3, n);
    }
}
