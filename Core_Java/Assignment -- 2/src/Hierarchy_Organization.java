class Employee{
	int salary;
	Employee()
	{
		salary = 0;
	}
	Employee( int salary)
	{
		this.salary=salary;
	}
	int getSalary() {
		return salary;
	}	
}

class Manager extends Employee{
	int hra,ta;
	//hra=housereant_allowances , ta= travelling_alloawnces
	Manager(){
		super();
		hra=ta=0;
	}
	Manager(int sal,int h,int t){
		super(sal);
		hra=h;
		ta=t;
	}
	int getSalary() {
		return(super.getSalary()+hra+ta);
	}
}

class Labour extends Employee{
	int Over_time;
	Labour(){
		super();
		Over_time=0;
	}
	Labour(int sal,int Ot){
		super(sal);
		Over_time=Ot;
	}
	int getSalary() {
		return(super.getSalary()+Over_time);
	}
	
}

public class Hierarchy_Organization {
	public static void main(String[] args) {
		
		Employee e = new Employee(30000);
		Manager m = new Manager(30000,500,400);
		Labour l = new Labour(30000,(5*100));
		
		System.out.println("Employee Salary : " + e.getSalary());
		System.out.println("Manager Salary : " + m.getSalary());
		System.out.println("Labour Salary : " + l.getSalary());
		
		int totalsalary=0;
		totalsalary = totalsalary + e.getSalary();
		totalsalary = totalsalary + m.getSalary();
		totalsalary = totalsalary + l.getSalary();
		
		System.out.println("Total Salary : " + totalsalary);
		
		}
	}
		

