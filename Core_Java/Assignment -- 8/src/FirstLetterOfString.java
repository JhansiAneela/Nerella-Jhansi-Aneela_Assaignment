interface consumer
{
	void first_index(String[] arr);
}
public class FirstLetterOfString
{
	public static void main(String[] args)
	{
		
		String[] check= {"Bhargav","Aneela","Angajala"};
		consumer ca = (arr)->
		{
			for(int i=0;i<arr.length;i++)
			{
				char sb=arr[i].charAt(0);
				System.out.println(sb);
			}
			
		};
	
		
		ca.first_index(check);
	}
}
/*import java.util.*;
public class FirstLetterOfString {

	String word;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List < String > wordList = Arrays.asList("Bhargav","Aneela","Kanna");
		wordList.forEach((t) -> System.out.println(t));
		wordList.forEach((t) ->{
			StringBuilder sb=new StringBuilder();
			sb=sb.append(t.charAt(0));
			System.out.println(sb);
		});
		
	}

}*/
	

