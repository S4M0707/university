// To determine if a given number is prime or not.

package week1;

import java.util.*;

public class Q1
{
    static boolean prime(int n)
    {
        if(n < 2)
            return false;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = input.nextInt();

            if(prime(n))
                System.out.println(n + " is a prime number");
            else
                System.out.println(n + " is not a prime number");
        }
    }
}