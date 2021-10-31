import java.util.HashSet;
import java.util.Iterator;
public class HashSet_Example
{
	public static void main(String[] args)
	{
		HashSet h = new HashSet();
		h.add("Bhargav");
		h.add("Ananthapur");
		h.add(22000);
		h.add("Aneela");
		h.add("Macherla");
		h.add(22000);
		h.add("Friends");
		h.add(null);
		h.add("Working in");
		h.add("Capgemini");
		
		System.out.println("Hashset :" +h);
		for(Object i : h)
		{
			System.out.println(i);
		}
		
	}

}
