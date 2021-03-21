package harshit;
class Student
{
	int rollNumber;
	void getNumber(int n)
	{
		rollNumber=n;
	}
	void displayNumber()
	{
		System.out.println("Roll No.: "+rollNumber);
	}
}
class Test extends Student
{
	int sub1,sub2;
	void getMarks(int x,int y)
	{
		sub1=x;
		sub2=y;
	}
	void displayMarks()
	{
		System.out.println("Marks Obtained");
		System.out.println("Sub1: "+sub1);
		System.out.println("Sub2: "+sub2);
	}
}
interface Sports
{
	float sportWt=0.6f;
	void displayWt();
}
class Result extends Test implements Sports
{
	float total;
	public void displayWt()
	{
		System.out.println("Sport Weightage: "+sportWt );
	}
	void display()
	{
		total = sub1+sub2+sportWt;
		displayNumber();
		displayMarks();
		displayWt();
		System.out.println("Total Score: "+total);
	}
}
public class multipleinheritance {
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Result student1 = new Result();
		student1.getNumber(8);
		student1.getMarks(90,80);
		student1.display();
	}
}
