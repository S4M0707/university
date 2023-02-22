// To display all primes b/w given 2 limits.

package week1;

import java.util.*;

public class Q2
{
    static void primes(int a, int b)
    {
        System.out.println("Primes between " + a + " and " + b + " are:");
        while(a <= b)
        {
            int i;
            for(i=2; i<=a/2; i++)
            {
                if(a % i == 0)
                    break;
            }
            if(i > a/2)
                System.out.print(a + " ");
            
            a++;
        }
    }

    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a and b (limits):");
            int a = input.nextInt();
            int b = input.nextInt();

            primes(a, b);
        }
    }
}