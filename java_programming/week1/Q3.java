package week1;

import java.util.Scanner;

public class Q3
{
    static int fabi(int n)
    {
        if(n <= 1)
            return n;
        return fabi(n-1) + fabi(n-2);
    }
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = input.nextInt();
            
            for(int i=1; i<=n; i++)
                System.out.print(fabi(i) + " ");
        }
    }
}
