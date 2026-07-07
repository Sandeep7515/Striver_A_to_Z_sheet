import java.util.Scanner;

public class GCD
{
    static void bruteForce(int num1,int num2)
    {
        int gcd;
        if (num1 < num2)
            gcd = num1;
        else
            gcd = num2;

        for (int i = gcd; i >= 1; i--) 
        {
            if (num1 % i == 0 && num2 % i == 0) 
            {
                System.out.println("GCD = " + i);
                break;
            }
        }
    }

    static void euclidean(int num1,int num2)
    {
        //gcd( a , b) = gcd ( a-b , b )  where a > b
        while( num2 != 0 )
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.print("GCD : " + num1);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        bruteForce(num1 ,num2 );
 //       euclidean(num1 ,num2 );
        sc.close();
    }
}