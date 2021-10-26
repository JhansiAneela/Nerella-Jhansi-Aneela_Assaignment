import java.util.*;
class Employee
{
	int id;
	int salary;
	String name,department,displayDetails;
	public Employee(int id,String name,String department,String displayDetails,int salary) 
	{
		this.id=id;
		this.salary =salary;
		this.name=name;
		this.department=department;
		this.displayDetails=displayDetails;	
	}
	
}

public class HashSetExample 
{
	public static void main(String[] args)
	{
		HashSet<Employee> set = new HashSet<Employee>();
		
		// Creating Employees
		
		Employee E1 = new Employee(101 ,"Bhargav" , "works on L & D", "with C and C++" ,22000);
		Employee E2 = new Employee(102 , "Aneela" , "works on BU", "with Java Fullstack" ,22000);
		
		// Adding Employees to Hashset
		
		set.add(E2);
		set.add(E1);
		
		// Traversing Hashset
		
		for(Employee E:set)
		{
			System.out.println(E.id+""+E.name+""+E.department+""+E.displayDetails+""+E.salary);
		}	
			
	}

}
