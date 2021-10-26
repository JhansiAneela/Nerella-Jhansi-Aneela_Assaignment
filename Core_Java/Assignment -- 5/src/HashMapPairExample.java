import java.util.*;
public class HashMapPairExample 
{
	public static void main(String[] args)
	{
		// Creating HashMap
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		// put elements in Map
		
		map.put("1 ","Hello");
		map.put("2 ","Bhargav");
		map.put("3 ","Hii");
		map.put("4 ","Aneela");
		
		// Keyset() method returns all the keys in HashMap
		
		/*Set<String> mapkey =   map.keySet();
		System.out.println("Initial Keys : " + mapkey);
		
		// Values () method returns all the keys in HashMap
		
		Collection<String> mapvalues =  map.values();
		System.out.println("Initial Values : " + mapvalues);*/
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(String.format("Keys : %s", m.getKey()));
			System.out.println(String.format("Values :%s", m.getValue()));
		}
		
	}

}