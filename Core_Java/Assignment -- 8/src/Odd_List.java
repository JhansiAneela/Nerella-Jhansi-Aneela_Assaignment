import java.util.*;
public class Odd_List 
{
	public static void main(String[] args)
	{

		Collection<String> names = new ArrayList<>();
		names.add("Bhargav");
		names.add("Anee");
		names.add("srujju");
		System.out.println("List before removing odd length elements \n");
		System.out.println(names);
		System.out.println();
		System.out.println("List after removing odd length elements\n");
		
		
		
		names.removeIf(name -> name.length()%2!=0);
				
		System.out.println(names);

	}
	

}
