package harshit;
import java.util.Scanner;
public class bill {
	long phno;
	String sname;
	int n;
	double amt;
	bill(long x, String y, int z)
	{
		phno=x;
		sname=y;
		n=z;
	}
	void compute()
	{
		if(n<100)
			amt=500;
		else if(n<200)
			amt=(n-100)+500;
		else if(n<300)
			amt=500+100+(n-200)*1.2;
		else
			amt=500+100+(n-200)*1.2+(n-300)*1.5;
	}

	public String toString()
	{
		return "\t\t    BHARAT SANCHAR NIGAM LIMITED\n\nSubscriber Name : "+ sname +"\t\tTelephone number : "+phno+"\nCalls Made : "+n+"\t\t\tAmount :  "+amt;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of customer : ");
		String name=sc.nextLine();
		System.out.println("Enter the Telephone number : ");
		long no=sc.nextLong();
		System.out.println("Enter number of calls made : ");
		int n=sc.nextInt();
		bill obj=new bill(no,name,n);
		obj.compute();
		System.out.println(obj);
		sc.close();

	}

}
