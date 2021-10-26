class Account{
	int Amount;
	Account()
	{
		Amount = 0;
	}
	Account( int Amount)
	{
		this.Amount=Amount;
	}
	int getAmount() {
		return Amount;
	}	
}

class Savings_Account extends Account{
	int fd;
	// fd=fixed deposits
	Savings_Account(){
		super();
		fd=0;
	}
	Savings_Account(int Amount,int f){
		super(Amount);
		fd=f;
	}
	int getAmount() {
		return(super.getAmount()+fd);
	}
}

class Current_Account extends Account{
	int Cash_Credit;
	Current_Account(){
		super();
		Cash_Credit=0;
	}
	Current_Account(int Amount,int CC){
		super(Amount);
		Cash_Credit=CC;
	}
	int getAmount() {
		return(super.getAmount()+Cash_Credit);
	}
	
}

public class Bank_Account{
	public static void main(String[] args) {
		
		Account A = new Account(10000);
		Savings_Account SA = new Savings_Account(10000,5000);
		Current_Account CA = new Current_Account(10000,12000);
		
		System.out.println("Account : " + A.getAmount());
		System.out.println("Savings Account with fixed deposit : " + SA.getAmount());
		System.out.println("Current_Amount : " + CA.getAmount());
		
		int totalAmount=0;
		totalAmount = totalAmount + SA.getAmount();
		totalAmount = totalAmount - CA.getAmount();
		
		System.out.println("Total Amount : " + totalAmount);
		
	}

}
