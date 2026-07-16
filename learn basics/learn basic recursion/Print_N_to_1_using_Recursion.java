import java.util.Scanner;

public class Print_N_to_1_using_Recursion
{
    static void print_num(int n) 
    {
        if (n == 0)
        {
            return;
        }
        System.out.print(n + " ");
        print_num(n - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("It prints from "+ n + " to  1 : " );
        print_num(n);
    }

}
