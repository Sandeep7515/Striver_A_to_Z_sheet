public class Highest_and_lower_freq_number
{
    public static void main(String[] args)
    {
        int[] arr = {6,2,1,2,6,3,1,6};

        // for digits 0 to 9
        int[] hash=new int[10];

        for(int i = 0; i < arr.length ; i++ )
        {
            hash[arr[i]]++;
        }
        
        int max =  Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;
        for(int j = 0 ; j < hash.length ; j++ )
        {
            
            if (hash[j] > 0) 
            {
                if(hash[j]>max)
                {   
                    max = hash[j]; 
                }

                if(hash[j]<min)
                {
                    min = hash[j];
                }
            }
        }
        
        System.out.print("Highest frequent number : ");
        for(int i = 0; i<hash.length;i++)
        {
            if(hash[i]==max)
            {
                System.out.print(i+" ");
            }
        }
        
        System.out.print("\nLowest frequent number : ");
        for(int i = 0; i<hash.length;i++)
        {
            if(hash[i]==min && hash[i] > 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
