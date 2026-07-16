import java.util.Scanner;
public class Print_1_to_N_using_Recursion
{
    static void print_num(int n) 
    {
        if (n == 0)
        {
            return;
        }
        print_num(n - 1);
        System.out.print(n + " ");
       
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("It prints from 1 to "+ n + " : " );
        print_num(n);
    }

}
