import java.util.*;
class empl implements Comparable<empl>
{
	int id;
	String name;
	String department;
	double salary;
	
	//constructor
	public empl(int id,String name, String department,double salary)
	{
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	
	public void getid()
	{
		System.out.println(id);
	}
	public void getname()
	{
		System.out.println(name);
	}
	public void getdepartment()
	{
		System.out.println(department);
	}
	public void getsalary()
	{
		System.out.println(salary);
	}
	//display all value
	public void display1()
	{
		System.out.println(id + " "+" " +name +" "+" "+department+" " +" "+salary);
	}


	@Override //override compareTo method of Comparable
	public int compareTo(empl o) {
		if(id>o.id)
		{
			return 1;
		}
		else if(id<o.id)
			{return -1;}
		else
		{
			return 0;
		}
	}
}

public class TreeSet_Example {

	public static void main(String[] args) {
		TreeSet<empl> emp= new TreeSet<>();
		empl s = new empl(1,"Bhargav","IT",1231);
		empl s1 = new empl(2,"Aneela","HR",21231);
		empl s2 = new empl(3,"kanna","food",51231);
		empl s4= new empl(4,"Ammulu","IT",1123231);
		empl s5 = new empl(5,"Srujana","HR",241231);
		empl s6 = new empl(6,"Bujji","food",234234);
		emp.add(s);
		emp.add(s1);
		emp.add(s2);
		emp.add(s4);
		emp.add(s5);
		emp.add(s6);
		
		Scanner sc = new Scanner(System.in);
		int user;
		while (true){
		System.out.println("Here is the operation which you can perform\n 1. getting id of employee. \n 2. getting name for employee\n 3. getting department for employee\n 4. getting salary for employee\n 5. printing all details");
		user= sc.nextInt();
	 
		switch (user)
	    {
	      case 1:
	    	  for ( empl em:emp)
	  		{
	  			em.getid();
	  		}
	        break;
	      case 2:
	    	  for ( empl em:emp)
		  		{
		  			em.getname();
		  		}
	        break;
	      case 3:
	    	  for ( empl em:emp)
		  		{
		  			em.getdepartment();
		  		}
	        break;
	      case 4:
	    	  for ( empl em:emp)
		  		{
		  			em.getsalary();
		  		}
	        break;
	      case 5:
	    	  for ( empl em:emp)
		  		{
		  			em.display1();
		  		}
	        break;
	    }	  
	   
	}}

}