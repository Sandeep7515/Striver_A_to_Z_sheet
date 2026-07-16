import java.util.Scanner;

public class Armstrong
{
    static int count_digits(int n)
    {
        int count=0;
        while(n > 0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
    static void armstrong(int n)
    {
        int sum=0;
        int original = n;
        int digits = count_digits(n);
        while(n > 0)
        {
            int rem = n % 10;
            sum = sum + ( int ) Math.pow(rem , digits);
            n = n / 10;
        }
        if(sum == original)
        {
            System.out.println(original +" is an Armstrong NUmber ");
        }
        else
        {
            System.out.println(original +" is not an Armstrong NUmber ");
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        armstrong(num);
            
    }
} 