import java.util.*;
public class HashMapPairExample1 
{
	public static void main(String[] args)
	{
		
		Calendar cal = Calendar.getInstance();
		Date date1 = new Date();
		System.out.println("Date = " +date1);
		cal.setTime(date1);
			
		// Creating HashMap
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Year",cal.get(Calendar.YEAR));
		map.put("Month",cal.get(Calendar.MONDAY));
		map.put("Day",cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("HashMap (Date) = " +map);
					
	}

}