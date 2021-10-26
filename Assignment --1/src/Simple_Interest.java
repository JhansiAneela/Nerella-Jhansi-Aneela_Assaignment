import java.util.Scanner;
public class Simple_Interest {
public static void main(String[] args) {
		
		float principal,rate,time;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter principal amount : ");
		principal=scanner.nextFloat();
		
		System.out.println("Enter rate : ");
		rate=scanner.nextFloat();
		
		System.out.println("Enter time : ");
		time=scanner.nextFloat();
		
		scanner.close();
		
		double SimpleInterest = (principal*time*rate)/100;
		System.out.println("Simple Interest  after " + time + "years: "+SimpleInterest);
		
	}
}
