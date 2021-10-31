public class Fruit {
	
	String name;
    int price;
    int calories;
    String color;
    public Fruit(String name, int price, int calories, String color) {
        this.name = name;
        this.price=price;
        this.calories = calories;
        this.color=color;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getCalories() {
        return calories;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "fruits [name=" + name + ", colour=" + color + "]";
    }

}
