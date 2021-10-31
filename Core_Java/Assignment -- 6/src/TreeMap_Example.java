import java.util.*;
class contact implements Comparable<contact>
{
	 long Phone;
	String name;
	String email;
	
	
	//constructor for contact
	public contact(String name,String email)
	{
		
		this.name = name;
		this.email = email;
		
	}
	//this will return the string
	public String toString()
	{
		return name +" "+email ;
	}

		//WE HAVE TO OVERIDE IT WHEN WE ARE IMPLEMENTING COMPARABLE INTERFACE 
	@Override
	public int compareTo(contact o) {
		
		return 0;
	}
	
}

public class TreeMap_Example 
{

	public static void main(String[] args) 
	{
		
//		contact c= new contact();
		//TREEMAP OBJECT....
		
		TreeMap<Long,contact> map=new TreeMap<>();
		//PUTTING KEY VALUE IN TREEMAP
		map.put(77545646l,new contact("Bhargav","bhargav@"));
		map.put(756747l,new contact("Aneela","aneela@"));
		map.put(8979399511l,new contact("Kanna","kanna@"));
		
		//PRINTING VALUES......
		
		for(Map.Entry m:map.entrySet())
		{    
			System.out.println(m.getKey()+" "+m.getValue());    
		} 
		
       //above one is for ascending order..here below one is for descending order..
		
		Map<Long, contact> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());
		reverseSortedMap.putAll(map);
		System.out.println("Descending order :");
		System.out.println(reverseSortedMap);
	}
	
}

