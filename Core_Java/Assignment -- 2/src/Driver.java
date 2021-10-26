abstract class Persistence{
	abstract public void persist();
}

class FilePersistence extends Persistence
{
	public void persist() 
	{
		System.out.println("Data is being saved in file");
	}
}

class DatabasePersistence extends Persistence
{
	public void persist() 
	{
		System.out.println("Data is being saved in database");
	}
}


public class Driver 
{
	public static void main(String[] args)
	{
		Persistence obj1 = new FilePersistence();
		Persistence obj2 = new DatabasePersistence();
		obj1.persist();
		obj2.persist();
	}

}
