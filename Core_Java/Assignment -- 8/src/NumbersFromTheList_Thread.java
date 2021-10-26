import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class javathread extends Thread
{  
	public void run()
	{  
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator itr=list.iterator();
		  while(itr.hasNext())
		  { 
		   System.out.println(itr.next());  
		  }   
	} 
}
	public class NumbersFromTheList_Thread
	{
		public static void main(String args[])
		{  
		
		javathread t1=new javathread();  
		t1.start();
		
	 	}  
	}
		



