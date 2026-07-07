import java.util.Scanner;

public class Patterns_Striver
{
  static void pattern1(int n)
  {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        } 
       System.out.println();
  }

  static void pattern2(int n)
  {
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
   System.out.println();
  }
  
  static void pattern3(int n)
  {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
   System.out.println();
  }

  static void pattern4(int n)
  {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    System.out.println();
  }

  static void pattern5(int n)
  {
    for(int i=1;i<=n;i++)
    {
        for(int j=n;j>=i;j--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
  }

  static void pattern6(int n)
  {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i+1;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println();
  }

  static void pattern7(int n)
  {
    for(int i=0;i<n;i++)
    {
        //space
        for(int j=0;j<n-i-1;j++)
        {
            System.out.print(" ");
        }

        //star
        for(int j=0;j<2*i+1;j++)
        {
            System.out.print("*");
        }

        //space
        for(int j=0;j<n-i-1;j++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }
     System.out.println();
  }

  static void pattern8(int n)
  {
    for(int i=0;i<n;i++)
    {
    //space
    for(int j=0;j<i;j++)
    {
        System.out.print(" ");
    }
    //star
    for(int j=0;j<2*n-(2*i+1);j++)
    {
        System.out.print("*");
    }
   //space
    for(int j=0;j<i;j++)
    {
        System.out.print(" ");
    }
    System.out.println(" ");
    }
    System.out.println();
  }

  static void pattern9(int n)
    {
        
        for(int i=0;i<2*n;i++)
        {
            int space;
            int star;
            //space
            if(i<n)
            {
                space = n - i - 1;
                star = 2 * i + 1;
            }
            else
            {
                space = i - n;
                star = 2 * (2 * n - i) - 1;
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }

            //star
            for(int j=0;j<star;j++)
            {
                System.out.print("*");
            }
            //space
            
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }
         System.out.println();
    }

    static void pattern10(int n)
    {
        for(int i=0;i<2*n;i++)
        {
            int stop=i;
            if(i>n)
            {
                stop=2*n-i;
            }
            for(int j=0;j<stop;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern11(int n)
    {
        for(int i=1;i<=n;i++)
        {
        
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");    
                }
                else
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern12(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //number
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            //space
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print("  ");
            }
            //number
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
        System.out.println();
        }
        System.out.println();
    }

    static void pattern13(int n)
    {
        int start=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start+=1;
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern14(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(char j='A';j<='A'+i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
         System.out.println();
    }

    static void pattern15(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(char j='A';j<='A'+n-i-1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println(); 
    }
  
    static void pattern16(int n)
    {
        for(int i=0;i<n;i++)
        {
            char ch=(char)('A'+i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern17(int n)
    {
      
        for(int i=0;i<n;i++)
        {
            
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print("  ");
            }
            
            char ch='A';
            int breakpoint=(2*i+1)/2;

            //alphabet
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print(ch+" ");
                if(j<breakpoint)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
            }
            System.out.println();
        }
        System.out.println(); 
    }

    static void pattern18(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j<n;j++)
            {
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern19(int n)
    { 
        //upper part
        int space=0;
        for(int i=0;i<n;i++)
        {
            //star
            for(int j=0;j<n-i;j++)
            {
                System.out.print("* ");
            }
            //space
           
            for(int j=0;j<space;j++)
            {
                System.out.print("  ");
             
            }
            //star
            for(int j=0 ;j< n-i ; j++)
            {
                System.out.print("* ");
            }
               space+=2;    
            System.out.println();
        }
         // Lower part
        space = 2 * (n - 1);

        for (int i=0; i<n;i++) 
        {
            // star
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }

            // space
            for(int j=0;j<space;j++) 
            {
                System.out.print("  ");
            }

            // star
            for(int j=0;j<=i;j++) 
            {
                System.out.print("* ");
            }

            space -= 2;
            System.out.println();
        } 
        System.out.println();   
    }


    static void pattern20(int n)
    {
        int space = 2 * (n - 1);

        // Upper half
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
                System.out.print("* ");

            for(int j = 0; j < space; j++)
                System.out.print("  ");

            for(int j = 0; j <= i; j++)
                System.out.print("* ");

            space -= 2;
            System.out.println();
        }

        // Lower half
        space = 2;

        for(int i = n - 2; i >= 0; i--)
        {
            for(int j = 0; j <= i; j++)
                System.out.print("* ");

            for(int j = 0; j < space; j++)
                System.out.print("  ");

            for(int j = 0; j <= i; j++)
                System.out.print("* ");

            space += 2;
            System.out.println();
        }
        System.out.println();
    }
    static void pattern21(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1)
                {
                    System.out.print("* ");
                }
                
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
    }
    static void pattern22(int n)
    {
        int size = 2 * n - 1;

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                int top = i;
                int bottom = size - 1 - i;
                int left = j;
                int right = size - 1 - j;

                int min = top;

                if(bottom < min)
                    min = bottom;

                if(left < min)
                    min = left;

                if(right < min)
                    min = right;

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        
        System.out.println("\nOUTPUT  \n");
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n); 
        pattern8(n); 
        pattern9(n);
        pattern10(n);
        pattern11(n); 
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
        pattern21(n);
        pattern22(n);

    }

}
