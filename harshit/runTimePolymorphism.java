package harshit;
abstract class Shape
{
	abstract void draw();
	abstract void erase();
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
	void erase()
	{
		System.out.println("Erasing Rectangle");
	}
}
public class runTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demonstration of Runtime Polymorphism");
		Shape s;
		Circle obj1 = new Circle();
		Square obj2 = new Square();
		Rectangle obj3 = new Rectangle();
		System.out.println("Polymorphic action of class");
		s = obj1;
		s.draw();
		s.erase();
		System.out.println("Polymorphic action of class");
		s = obj2;
		s.draw();
		s.erase();
		System.out.println("Polymorphic action of class");
		s = obj3;
		s.draw();	
		s.erase();
		System.out.println("End of program");
	}

}
