interface find
{
	void action(int num1,int num2);
}
public class Lambda_Arithmetic_Operators 
{
	public static void main(String[] args)
	{
		find fn = (num1,num2)->{System.out.println("Addition of two number is ->  " +(num1+num2) +"\n"+"Substract is  -> "+(num1-num2)+"\n"+
				"Multiplication is -> "+ (num1*num2)+"\n"+"Division is -> "+(num1/num2));};
						fn.action(10,5);
	}

}
