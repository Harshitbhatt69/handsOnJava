package harshit;

import java.util.Scanner;
class Parent
{
	double weight;
	Parent(double w)
	{
		weight=w;
	}
	void disp()
	{
		System.out.println("Weight = "+weight);
	}
	}
class Child extends Parent
{
	double height;
	Child(double w, double h)
	{
		super(w);
		height=h;
	}
	void disp()
	{
		super.disp();
		System.out.println("Height = "+height);
		calc();
	}
	void calc()
	{
		System.out.println("BMI of the person = "+weight/(height*height));
	}
}
public class UsingSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Demonstrationg use of super keyword");
		System.out.print("Enter the weight (in kg)= ");
		double weight=sc.nextDouble();
		System.out.print("Enter the height (in meteres) = ");
		double height=sc.nextDouble();
		Child obj=new Child(weight,height);
		obj.disp();
		sc.close();
	}

}
