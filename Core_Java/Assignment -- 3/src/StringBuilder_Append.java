public class StringBuilder_Append {
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("StringBuffer");
		StringBuilder sb2 = new StringBuilder(" is a peer class of String");
		
		StringBuilder sbf1 = new StringBuilder(sb1.append(sb2));
		
		StringBuilder sb3 = new StringBuilder("that provides much of");
		
		StringBuilder sbf2 = new StringBuilder(sbf1.append(sb3));
		
		StringBuilder sb4 = new StringBuilder("the functionality of strings.");
		
		StringBuilder result = new StringBuilder(sbf2.append(sb4));
		
		System.out.println(result);
		
	}

}
