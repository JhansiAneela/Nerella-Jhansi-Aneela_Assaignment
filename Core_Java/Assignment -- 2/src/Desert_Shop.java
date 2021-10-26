import java.util.*;
abstract class Desert{
	abstract int getcost();
}
class candy{
	int getcost()
	{
		return 5*60;
	}
}
class cookies{
	int	getcost()
	{
	return 6*70;	
	}
}
class icecream
{
	int getcost()
	{
	return 100;
	}
}

public class Desert_Shop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		candy obj1=new candy();
		cookies obj2=new cookies();
		icecream obj3=new icecream();
		String[] arr=new String[3];

		System.out.println("::Welcome to Yummy Desert Shop::");
		System.out.println("Select the one of the following options");
		System.out.println("1.Owner");
		System.out.println("2.Customer");
		int Option=sc.nextInt();
		if(Option==1) {
			System.out.println("Enter Menu items to get added into menu");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.next();
			}
			// this is for printing dessert 
			System.out.println("Your Dessert names are-->>>\n");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else {
			while(true){
				System.out.println("Please Select the items to place order");
				System.out.println("1. Candy:"+obj1.getcost());
				System.out.println("2. Cookies:"+obj2.getcost());
				System.out.println("3. IceCream:"+obj3.getcost());
				System.out.println("4. Exit our Application");
				System.out.println("Enter your choice::");
				int choice = sc.nextInt();//accept user input

				switch(choice){
				case 1: System.out.println("Your Order for Candy is placed");
				System.out.println("Your bill is:"+obj1.getcost());
				System.out.println("Thank you for palcing the Order.");
				break;
				case 2: System.out.println("Your Order for Cokkies are placed");
				System.out.println(obj2.getcost());
				System.out.println("Thank you for palcing the Order.");
				break;
				case 3: System.out.println("Your Order for IceCream is placed");
				System.out.println(obj3.getcost());
				System.out.println("Thank you for palcing the Order.");
				break;
				case 4:
				System.exit(0);
				default: System.out.println("Please select the Option by provided menu item number ");
				}
			}
		}
		sc.close();
	}

}
















