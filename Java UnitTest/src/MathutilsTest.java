import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathutilsTest 
{
	
	@Test
	void testAdd()
	{
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected,actual);
	}
	
	@Test
	void testSub()
	{
		MathUtils mathUtils = new MathUtils();
		int expected = 4;
		int actual = mathUtils.sub(6, 2);
		assertEquals(expected,actual);
	}
	

}
