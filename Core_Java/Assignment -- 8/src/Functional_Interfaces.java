import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Product 
{
	  private double price = 0.0;

	  public void setPrice(double price)
	  {
	    this.price = price;
	  }

	  public void printPrice()
	  {
	    System.out.println(price);
	  }
	}

public class Functional_Interfaces 
{

	public static void main(String[] args) 
	{	
		Predicate<String> isALongWord = t -> t.length() > 10;
		String s = "successfully";
		boolean result = isALongWord.test(s);
		
		Consumer<Product> updatePrice = p -> p.setPrice(5.9);
	    Product p = new Product();
	    updatePrice.accept(p);
	    p.printPrice();
	    
	    int n = 5;
	    modifyValue(n, val-> val + 10);
	    modifyValue(n, val-> val * 100);
	    
	    int x = 3;
        display(() -> x + 10);
        display(() -> x + 100);

	}
	
	static void modifyValue(int v, Function<Integer, Integer> function)
	{
	    int result = function.apply(v);
		System.out.println(result);
	}
	
	static void display(Supplier<Integer> arg)
	{
        System.out.println(arg.get());
    }

}