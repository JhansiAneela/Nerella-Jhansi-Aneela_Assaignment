public class String_Append {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("StringBuffer");
		StringBuffer sb2 = new StringBuffer(" is a peer class of String");
		
		StringBuffer sbf1 = new StringBuffer(sb1.append(sb2));
		
		StringBuffer sb3 = new StringBuffer("that provides much of");
		
		StringBuffer sbf2 = new StringBuffer(sbf1.append(sb3));
		
		StringBuffer sb4 = new StringBuffer("the functionality of strings.");
		
		StringBuffer result = new StringBuffer(sbf2.append(sb4));
		
		System.out.println(result);
		
	}

}
