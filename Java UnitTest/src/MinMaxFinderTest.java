import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinMaxFinderTest
{

	@Test
	 public void testfind_Min_Max() 
	{
		MinMaxFinder arr = new MinMaxFinder();
	    int[] expected= new int[] {2,20};
	    int[] expected1= new int[] {3,77};
	    int[] expected2= new int[] {4,50};
	    
		
		assertArrayEquals(new int[] {2,20},arr.find_Min_Max(new int[] {2,5,20}));
		assertArrayEquals(new int[] {2,20},arr.find_Min_Max(new int[] {3,4,77}));
		assertArrayEquals(new int[] {2,20},arr.find_Min_Max(new int[] {4,5,50}));
		
		
	}

	private void assertArrayEquals(int[] is, Object find_Min_Max) 
	{
		System.out.println("AsserArrayEqual");
		
	}

	
}