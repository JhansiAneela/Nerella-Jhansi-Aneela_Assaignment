import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinMaxTest
{

	@Test
	public void MinMaxtest() 
	{
		MinMax arr = new MinMax();
	    int[] expected= new int[] {2,20};
	    int[] expected1= new int[] {1,15};
	    int[] expected2= new int[] {3,60};
		
		assertArrayEquals(new int[] {2,20},arr.MinMax(new int[] {2,5,20}));
		assertArrayEquals(new int[] {2,20},arr.MinMax(new int[] {1,2,15}));
		assertArrayEquals(new int[] {2,20},arr.MinMax(new int[] {3,5,60}));
		
		
	}


	  private void assertArrayEquals(int[] is, Object find_Min_Max) 
	  {
		  System.out.println("AsserArrayEqual");
	  
	  }
	 
	
	
	
}



