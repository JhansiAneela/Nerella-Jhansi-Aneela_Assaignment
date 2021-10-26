abstract class Shape{
	 abstract public void draw();
}

 class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Rectangle shape has drawn");
	}
}
 class Line extends Shape
{
	public void draw()
	{
		System.out.println("Line shape has drawn");
	}
}

class Cube extends Shape
{
	public void draw()
	{
		System.out.println("Cube shape has drawn");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Circle shape has drawn");
	}
}

class Square extends Shape
{
	public void draw()
	{
		System.out.println("Square shape has drawn");
	}
}

public class Shapes {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		rectangle.draw();
		Shape line = new Line();
		line.draw();
		Shape cube = new Cube();
		cube.draw();
		Shape circle = new Circle();
		circle.draw();
		Shape square = new Square();
		square.draw();
		
			
	}

}
