import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.Collator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MathUtils 
{
	
	MathUtils mathUtils;
	
	
	@BeforeAll
	static void setup()
	{
		System.out.println("BeforeAll executed");
	}
	
	
	@BeforeEach
	void init()
	{
		System.out.println("BeforeEach executed");
		
	}
	
	
	@Test
	void testAdd() 
	{ 
		System.out.println("Addition of two numbers");
		
	}
	 
	  
	public int add(int i, int j) 
	{
		return i+j;
	}

	
	@Test 
	void testSub()
	{
		System.out.println("Subtraction of two numbers");
	}
	
	
	public int sub(int i, int j) 
	{
		return i-j;
	}
	
	
	
	@AfterEach()
	void tearThis()
	{
		System.out.println("AfterEach Executed");
	}
	
	
	@AfterAll()
	static void tear()
	{
		System.out.println("AfterAll Executed");
	}


}
