public class String_Operations {
	public static void main(String[] args) {
		
		String str = "Java String pool refers to collection of strings which are stored in heap memory.";
		
		// TO print Lowercase
		System.out.println(str.toLowerCase());
		
		// To print Uppercase
		System.out.println(str.toUpperCase());
		
		// To replace all 'a' with '$'
		System.out.println(str.replace('a' , '$'));
		
		// To get Contains word in Str
		System.out.println(str.contains("collection"));
		
		// To check string matches to original str
		String str1 = "Java String pool refers to collection of strings which are stored in heap memory.";
		System.out.println(str.equals(str1));
		
		// To check string matches or not
		System.out.println(str == str1);
		


	}

}
