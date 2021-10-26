// To Print default number
public class Armstrong_Number {
	public static void main(String[] args) {
		int num=370, number, temp, result=0;
		number=num;
		while(number!=0) {
			temp=number%10;
			result=result+temp*temp*temp;
			number=number/10;
		}
		if(result==num) 
			System.out.println(num+ " is an Armstrong number");
		else 
			System.out.println(num+ " is not an Armstrong number");	
	}
}

// To take any value
/*import java.util.Scanner;
public class Armstrong_Number {
	public static void main(String[] args) {
		int num,number,temp,result=0;
		System.out.println("Enter number :");
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		scanner.close();
		number = num;
		while(number!=0) {
			temp=number%10;
			result=result+temp*temp*temp;
			number=number/10;
		}
		if(result==num) 
			System.out.println(num+ " is an Armstrong number");
		else 
			System.out.println(num+ " is not an Armstrong number");	
	}
}*/

