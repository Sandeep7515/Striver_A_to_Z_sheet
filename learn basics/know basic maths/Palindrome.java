import java.util.Scanner;

public class Palindrome
{

    static void palindrome_num(int n)
    {  
        int ori=n;
        int rev=0;
        while(n > 0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }  
        if(ori==rev)
        {
            System.out.println(ori+" is a palindrome Number");
        }
        else
        {
            System.out.println(ori+" is not a palindrome Number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        palindrome_num(num);
        sc.close();
    }
}