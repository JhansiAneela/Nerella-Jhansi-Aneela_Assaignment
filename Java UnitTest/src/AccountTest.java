import static org.junit.jupiter.api.Assertions.assertEquals;
import javax.naming.InsufficientResourcesException;

import org.junit.jupiter.api.Test;

public class AccountTest 
{
	
	@Test
	void array() throws InsufficientResourcesException
	{
		Account arr = new Account();
		assertEquals(2000, arr.withdraw(1000));
	}
}
