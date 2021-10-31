import java.util.*;
import java.util.stream.Collectors;

public class low_Calories_names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> FruitList = new ArrayList<Fruit>();  
        //Adding Products  
        FruitList.add(new Fruit("Apple",100,250,"red"));  
        FruitList.add(new Fruit("banana",120,120,"yellow"));  
        FruitList.add(new Fruit("kiwi",30,280,"green"));  
        FruitList.add(new Fruit("orange",80,280,"orange"));  
        FruitList.add(new Fruit("pineapple",59,90,"yellow"));
        FruitList.add(new Fruit("pomegranatte",70,90,"red"));
        // This is more compact approach for filtering data  
        FruitList.stream()  
                             .filter(Fruit -> Fruit.calories <= 100)  
                             .forEach(Fruit -> System.out.println(Fruit.name));   
        Map<String,String> FruitMap = FruitList.stream().collect(Collectors.toMap(p->p.name, p->p.color));  
                  
            System.out.println(FruitMap);  
            List<Fruit> FruitList1 = FruitList.stream()
            		.filter(Fruit-> Fruit.color.equals("red")).
            	    collect(Collectors.toList());
            System.out.println(FruitList1);

	}

}
