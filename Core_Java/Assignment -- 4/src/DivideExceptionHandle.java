import java.util.Scanner;
public class DivideExceptionHandle
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int a =  scanner.nextInt();
		
		System.out.println("Enter second number :");
		int b =  scanner.nextInt();
	
		try
		{
			System.out.println(a/b);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception Condition Program is ending ");
		}
	}
}

