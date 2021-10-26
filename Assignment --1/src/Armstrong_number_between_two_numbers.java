import java.util.Scanner;
public class Armstrong_number_between_two_numbers {
	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number :");
		num1 = scanner.nextInt();
		System.out.println("Enter Second number :");
		num2 = scanner.nextInt();
		for(int i=num1;i<num2;i++) {
			int temp,rem,sum=0;
			temp=i;
			while(temp!=0) {
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
			}
			if(sum==i) {
				System.out.println(""+i+" is an Armstrong number.");
			}			
		}		
	}

}
