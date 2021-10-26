public class Account {
	private int balance = 3000;

	public int balance() {
		return balance;
	}

	public void withdraw(int amount) throws InSufficientFundException {
		try {
		if (amount > balance) {
			throw new InSufficientFundException(String.format(
					"Current balance %d is less than requested amount %d",
					balance, amount));
		}
		balance = balance - amount;
		if (amount < 0) {
			throw new IllegalBankTransactionException(String.format(
					"With-drawing amount is negative", amount));
		}
		}
		catch(InSufficientFundException ife) {
			ife.printStackTrace();
		}
		catch(IllegalBankTransactionException ite) {
			ite.printStackTrace();
		}
	}
}

class InSufficientFundException extends RuntimeException{
	private String message;

	public InSufficientFundException(String message) {
		this.message = message;
	}

	public InSufficientFundException(Throwable cause, String message) {
		super(cause);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}



class IllegalBankTransactionException extends RuntimeException{
	private String message;

	public IllegalBankTransactionException(String message) {
		this.message = message;
	}

	public IllegalBankTransactionException(Throwable cause, String message) {
		super(cause);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}