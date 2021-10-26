import java.util.*;
public class HashMapExample 
{
	public static void main(String[] args)
	{
		// Creating HashMap
		
		HashMap<Integer,Double> map = new HashMap<Integer,Double>();
		
		// put elements in Map
		
		map.put(1,1.1);
		map.put(5,5.1);
		map.put(7,7.6);
		map.put(9,9.2);
		map.put(2,12.3);
		map.put(3,10.4);
		map.put(6,15.6);
		map.put(4,14.9);
		map.put(8,17.8);
		map.put(10,19.2);
		
		System.out.println("Iterating HashMap ..");
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
			
		}
						
	}

}
