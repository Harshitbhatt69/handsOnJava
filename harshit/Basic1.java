package harshit;

public class Basic1 {
	static int a = 5;
	static int b;
	static void func(int c)
	{
		//static method
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		System.out.println("Value of c="+c);
	}
	static {
		//static block
		System.out.println("Inside static block");
		b=a+5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func(5);		
	}

}
