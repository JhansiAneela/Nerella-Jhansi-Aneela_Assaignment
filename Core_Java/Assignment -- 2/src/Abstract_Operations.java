// Question 1: Abstract method u have to declare entire class abstract
/*abstract class Animal
 { 
  public abstract void sound();
 }
 class Dog extends Animal
 { 
	 public void sound()
     {
		 System.out.println("Woof");
     }
 }
 public class Abstract_Operations
 {
	 public static void main(String args[])
	 {
		 Animal obj = new Dog();
		 obj.sound();
	 }
 }*/ 

// Question 2: Abstract class cannot be instantiated

/*abstract class Person
{
	abstract String getNmae();
	int getAge()
	{
		return 22;
	}
}
public class Abstract_Operations
{
	public static void main(String[] args)
	{
		System.out.println(new Person().getName());
		
	}
}*/

// Question 3: Override the abstract method

/*abstract class BankAccount 
{
	abstract void viewAccountNumber();
}
class CheckingAccount extends BankAccount
{
	public void viewAccountNumber() 
	{
		System.out.println("Checking account number: #1932042555");
	}
}
public class Abstract_Operations
{
	public static void main(String[] args)
	{
		CheckingAccount obj = new CheckingAccount();
		obj.viewAccountNumber();
	}
}*/


// Question 4: Abstract class cannot be private 

/*abstract class Display 
{
   private static abstract void display()
   {
	   System.out.println("This is a method of abstract class");
   }
}*/
  
// Question 5: Abstract class cannot be final

/* abstract class Application
 {
  public final abstract void Display(); 
 } 
 class Fees extends Application
 {
    public void Display()
    {
    	// throws an error
    }
    */
 
// Question 6: Abstract class without having any abstract method

/*abstract class MyClass 
{
   public void display() 
   {
      System.out.println("This is a method of abstract class");
   }
}
public class Abstract_Operations extends MyClass
{
	public static void main(String[] args)
	{
		new Abstract_Operations().display();
	}
}*/
  
