import java.util.Scanner;
public class Total_And_average {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		String A,B,C;
		int A_S1, A_S2, A_S3, B_S1, B_S2 ,B_S3, C_S1, C_S2 ,C_S3;
		
		System.out.println("Enter Student A Marks");
		
		System.out.println("Enter Subject S1 Marks");
		A_S1=sc.nextInt();
		System.out.println("Enter Subject S2 Marks");
		A_S2=sc.nextInt();
		System.out.println("Enter Subject S3 Marks");
		A_S3=sc.nextInt();
		
		System.out.println("Enter Student B Marks");
		
		System.out.println("Enter Subject S1 Marks");
		B_S1=sc.nextInt();
		System.out.println("Enter Subject S2 Marks");
		B_S2=sc.nextInt();
		System.out.println("Enter Subject S3 Marks");
		B_S3=sc.nextInt();
		
		System.out.println("Enter Student C Marks");
		
		System.out.println("Enter Subject S1 Marks");
		C_S1=sc.nextInt();
		System.out.println("Enter Subject S2 Marks");
		C_S2=sc.nextInt();
		System.out.println("Enter Subject S3 Marks");
		C_S3=sc.nextInt();
		
		int A_total=A_S1+A_S2+A_S3;
		int A_avg=A_total/3;
		
		int B_total=B_S1+B_S2+B_S3;
		int B_avg=B_total/3;
		
		int C_total=C_S1+C_S2+C_S3;
		int C_avg=C_total/3;
		
		System.out.println("Total marks of Student A:"+A_total);
		System.out.println("Average marks of Student A:"+A_avg);
		
		System.out.println("Total marks of Student B:"+B_total);
		System.out.println("Average marks of Student B:"+B_avg);
		
		System.out.println("Total marks of Student C:"+C_total);
		System.out.println("Average marks of Student C:"+C_avg);
		
		int S1_total=A_S1+B_S1+C_S1;
		int S1_avg=S1_total/3;
		
		int S2_total=A_S2+B_S2+C_S2;
		int S2_avg=S2_total/3;
		
		int S3_total=A_S3+B_S3+C_S3;
		int S3_avg=S3_total/3;
		
		System.out.println("Total marks scored by all the students in subject S1:"+S1_total);
		System.out.println("Average marks scored by all the students in subject S1:"+S1_avg);
		
		System.out.println("Total marks scored by all the students in subject S2:"+S2_total);
		System.out.println("Average marks scored by all the students in subject S2:"+S2_avg);
		
		System.out.println("Total marks scored by all the students in subject S3:"+S3_total);
		System.out.println("Average marks scored by all the students in subject S3:"+S3_avg);

	}

}

