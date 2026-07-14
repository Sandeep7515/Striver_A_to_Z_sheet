import java.util.Scanner;

public class ReverseArray
{
    static void reverse_arr(int[] arr)
    {
        System.out.print("Reverse of array is :");
        for(int i=arr.length-1;i>=0;i--)
        {
           System.out.print(arr[i]+" "); 
        }
    }

    // Inplace Array reverse


    static void reverse_arr_inplace(int[] arr)
    {
        System.out.print("Reverse of array is :");
        int start = 0;
        int stop = arr.length - 1;
        while(start < stop)
        {
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp;
            start++;
            stop--;
        }
        for(int i : arr)
        {
            System.out.print(i+" "); 
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array : ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+ n +" elements : ");
        for(int i=0;i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
 //       reverse_arr(arr);
        reverse_arr_inplace(arr);
    }

}