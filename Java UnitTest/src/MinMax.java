import java.util.ArrayList;
import java.util.Arrays; 

public class MinMax 
{
 
   static int max;
   static int min;

	public static int[] MinMax(int my_array[]) 
    {
		
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        
        for (int i = 1; i < len - 1; i = i + 2) 
        {
            if (i + 1 > len)
            {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];                
            }
            
            if (my_array[i] > my_array[i + 1]) 
            {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            
            if (my_array[i] < my_array[i + 1]) 
            {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
        return my_array;
    }

    public static void main(String[] args) 
    {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        MinMax(my_array);
        System.out.println(" Original Array: "+Arrays.toString(my_array));
       
        System.out.println("Minimum Value : " + min);
        System.out.println("Maxmimum Value : " + max);
        
    }
}


