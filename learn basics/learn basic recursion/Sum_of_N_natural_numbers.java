import java.util.Scanner;

public class Sum_of_N_natural_numbers
{
    static int sum_num(int n) 
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n + sum_num( n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Sum of number from 1 to "+ n + "  : "+sum_num(n));
    }

}
