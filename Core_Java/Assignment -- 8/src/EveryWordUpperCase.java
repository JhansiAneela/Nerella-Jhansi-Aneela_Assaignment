import java.util.function.UnaryOperator;

public class EveryWordUpperCase
{
	public static void main(String[] args)
	{
		//using unary operator....
		
		UnaryOperator<String> caseconversion = (String str) -> { return str.toUpperCase();} ;
		String newstr = caseconversion.apply("i am working in capgemini.");
		System.out.println(newstr);
		
		//by replaceall() method.....

	    String s1="I am Working in capgemini.";  
	    String s2= s1.toLowerCase();
	    String s3 = s1.toUpperCase();

	    //replaces all small letter to capital    

	    String replaceString=s1.replaceAll(s2,s3);

	    System.out.println(replaceString);  

	}

}
