import java.util.Scanner;

public class Reverse_a_Number
{

    static void reverse_num(int n)
    {  
        int rev = 0;
        int m=n;
        while (n > 0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;

        }    
        System.out.println("Reverse of "+m+" is : "+rev);  
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        reverse_num(num);
        sc.close();
    }
}