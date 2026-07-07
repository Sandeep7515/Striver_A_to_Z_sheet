import java.util.Scanner;

public class Count_number_of_digit
{

    static void count_digits(int n)
    {
        int count=0;
        int m=n;
        while(n > 0)
        {
            count++;
            n=n/10;
        }
        System.out.println("Number of digits in "+m +" is : "+count);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        count_digits(num);
    }
}