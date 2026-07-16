import java.util.Scanner;

public class String_is_Palindrome
{
    static void palindrome_string(String str)
    {
        StringBuilder s = new StringBuilder(str);
        String rev = s.reverse().toString();
        if(rev.equalsIgnoreCase(str))
        {
            System.out.println(str + " is a Palindrome");
        }
        else
        {
            System.out.println(str + " is not a Palindrome");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        
        palindrome_string(str);
    } 

}