import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		
		String UserName = "Bhargav";
		String Passward = "Aneela";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter UserName :");
		String inputUsername = scanner.next();
		
		System.out.println("Enter Passward :");
		String inputPassward = scanner.next();
		
		if((inputUsername.equals(UserName)) && (inputPassward.equals(Passward)))
		{
			System.out.println("Welcome Bhargav");
		}
		else
		{
			int count=0;
			while(count<=2)
			{
				if((!inputUsername.equals(UserName)) || (!inputPassward.equals(Passward)))
				{
					System.out.println("Wrong Entry!..Please try again");
					count++;
				}
			}
			if(count>2)
			{
				System.out.println("Please Contact Admin");
			}
		}
		
	}

}
