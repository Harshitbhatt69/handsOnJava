package harshit;

import java.util.*;
class detail
{
	int rollno;
	String name;
	detail(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	void disp()
	{
		System.out.println("Name = "+name+"\tRoll no. = "+rollno);
	}
}
public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name;
		System.out.println("\t\t\t\t\t\t\tArray of Objects");
		System.out.println();
		System.out.println("Enter the number of students = ");
		int no=sc.nextInt();
		detail obj[]=new detail[no]; 
		System.out.println();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter details for student "+(i+1));
			System.out.print("Roll no = ");
			rollno=sc.nextInt();
			System.out.print("Name = ");
			name=sc.next();
			obj[i]=new detail(rollno, name);
		}
		for(int j=0;j<no;j++)
		{
			System.out.println("Student "+(j+1));
			obj[j].disp();
		}
		sc.close();
	}

}
