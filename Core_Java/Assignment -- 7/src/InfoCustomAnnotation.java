import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Info
{
	int AuthorId(); // Multi-value annotation
	String AuthorName();
	String Date();
	String Time();
	int Version();
	
}


// Applying annotaton

class Hello
{
	@Info(AuthorId=10,AuthorName="Bhargav",Date="26-10-2021",Time="10:00",Version=6)
	public void testcase()
	{
		System.out.println("hello annotation");
	}
	
}


// Accesing annotation

public class InfoCustomAnnotation
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		Hello h = new Hello();
		Method m = h.getClass().getMethod("testcase");
		Info inf = m.getAnnotation(Info.class);
		
		System.out.println("AuthorId is : " +inf.AuthorId());
		System.out.println("AuthorName is : " +inf.AuthorName());
		System.out.println("Date is : " +inf.Date());
		System.out.println("Time is : " +inf.Time());
		System.out.println("Version is : " +inf.Version());
	}

}
