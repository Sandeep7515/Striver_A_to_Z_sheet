public class Count_freq_of_element
{
    public static void main(String[] args)
    {
        int[] arr = {6,2,1,2,6,3,1};

        // for digits 0 to 7
        int[] hash=new int[8];

        for(int i = 0; i < arr.length ; i++ )
        {
            hash[arr[i]]++;
        }

        for(int j =0 ; j < hash.length ; j++ )
        {

            System.out.println(j+" occurs : "+ hash[j]+" times ");
        }   
    }
}