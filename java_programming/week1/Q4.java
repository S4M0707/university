package week1;

import java.util.Scanner;

public class Q4
{
    static void sort(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            int small = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[small] > arr[j])
                    small = j;
            }
            if(small != i)
            {
                int temp = arr[i];
                arr[i] = arr[small];
                arr[small] = temp;
            }
        }
        System.out.println("After Sort:");
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the size: ");
            int n = input.nextInt();
            
            int arr[] = new int[n];
            System.out.println("Enter the array:");
            for(int i=0; i<n; i++)
                arr[i] = input.nextInt();

            sort(arr, n);
        }
    }
}