import java.util.Scanner;
// For optimal 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Factors_of_Number
{

// Bruteforce
   static void bruteforce_factors(int n)
    {
        System.out.print("Factors of "+ n + " are : "  );
        for(int i = 1;i <= n/2 ;i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.print(n);
    }

// Optimal 
   static void factors(int n) 
   {
        List<Integer> divisors = new ArrayList<>();
        System.out.print("Factors are : ");

        for (int i = 1; i <= Math.sqrt(n); i++) 
        {

            if (n % i == 0) 
            {
            divisors.add(i);

                if (i != n / i) 
                {
                    divisors.add(n / i);
                }
            
            }
        }
        Collections.sort(divisors);
       for (int m : divisors)
        {
            System.out.print(m + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        //bruteforce_factors(n);
        factors(num);
        sc.close();       
    }
}