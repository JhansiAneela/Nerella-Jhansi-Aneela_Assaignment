import java.util.Scanner;
public class income_tax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter CTC of Employee:");
		long CTC = scanner.nextInt();
		
		if(CTC>=500001 && CTC<=1000000)
		{
			System.out.println("Tax payable is 30%");
		}
		else if(CTC>=300001 && CTC<=500000) 
		{
			System.out.println("Tax payable is 20%");
		}
		else if(CTC>=181001 && CTC<=300000) 
		{
			System.out.println("Tax payable is 10%");
		}
		else if(CTC>=0 && CTC<=181000) 
		{
			System.out.println("Tax payable is NIll");
		}
		else {
			System.out.println("Tax payable is Other");
		}
	}

}
