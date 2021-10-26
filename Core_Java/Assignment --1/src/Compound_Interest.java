import java.util.Scanner;
public class Compound_Interest {
	public static void main(String[] args) {
		
		float principal,rate,time,number;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter principal amount : ");
		principal=scanner.nextFloat();
		
		System.out.println("Enter rate : ");
		rate=scanner.nextFloat();
		
		System.out.println("Enter time : ");
		time=scanner.nextFloat();
		
		System.out.println("Enter number : ");
		number=scanner.nextFloat();
		
		scanner.close();
		
		double amount = principal*Math.pow(1+(rate/number), number*time);
		double CInterest=amount-principal;
		
		System.out.println("Compound Interest  after " + time + "years: "+CInterest);
		System.out.println("Amount after "+ time + " years: "+amount);
		
		
	}

}
