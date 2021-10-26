interface order
{
	void find_order(int order_price,String order_status);
}

public class Print_Order 
{
	public static void main(String[] args) 
	{
		
		order o = (order_price,order_status)->
		{
			
			if((order_price>10000) && (order_status=="ACCEPTED")|| order_status=="COMPLETED")
			{
				System.out.println(order_price +" "+order_status );
			}
			else
			{
				System.out.println("Your Price is not greater than 10000");
			}
		};
		
		o.find_order(11000, "ACCEPTED");
		o.find_order(9000,"");
	
	}

}


