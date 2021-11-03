import javax.naming.InsufficientResourcesException;

public class Account 
{
	static int balance = 3000;
	public static void main(String[] args) throws InsufficientResourcesException
	{
		Account ac = new Account();
		int amount;
		int withdraw = ac.withdraw(amount=2000);
		System.out.println(balance);
	}
	
	public int withdraw(int amount) throws InsufficientResourcesException
	{
		if(balance<amount)
		{
			throw new InsufficientResourcesException(String.format(
					"Current balance %d is less than requested amount %d", 
					balance,amount));
		}
		
		balance =  balance-amount;
		return balance;
	}
}
