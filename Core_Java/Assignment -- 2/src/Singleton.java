public class Singleton 
{
	private static Singleton singleton;
	private Singleton()
	{
		//hinder other classes to create an object of this class
	}
	public static Singleton getInstance()
	{
		if(null == singleton)
		{
			singleton = new Singleton();
		}
		return singleton;
	}
}
		