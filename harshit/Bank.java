package harshit;
import java.util.*;
class Detail1
{
	String dname;
	long acno;
	String typeacc;
	double balance;
	Detail1(String dname,long acno,String typeacc,double balance)
	{
		this.dname=dname;
		this.acno=acno;
		this.typeacc=typeacc;
		this.balance=balance;
	}
	void deposit(double amnt)
	{
		balance+=amnt;
	}
	void withdraw(double amnt){
		if(amnt<=balance)
		{
			balance-=amnt;
			System.out.println("Amount withdrawn = "+amnt);
			System.out.println("New Balance = "+balance);
		}
		else
			System.out.println("Entered amount is greater than balance");
	}
	void disp() {
		System.out.println("Name of account holder -  "+dname);
		System.out.println("Balance = "+balance);
	}
	
}
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		long no;
		String type;
		double bal,amnt;
		System.out.println("\t\t\t\t\tXYZ BANK LIMITED");
		System.out.print("Enter the name of depositer : ");
		name=sc.nextLine();
		System.out.print("Enter the account number : ");
		no=sc.nextLong();
		System.out.print("Enter the type of account : ");
		type=sc.next();
		System.out.print("Enter the Balance : ");
		bal=sc.nextDouble();
		Detail1 obj=new Detail1(name,no,type,bal);
		System.out.println("Press 1 to deposit amount, 2 to withdraw amount, 3 to display and 4 to exit");
		int ch=sc.nextInt();
		while(ch!=4)
		{
		if(ch==1) {
			System.out.println("Enter the amount to deposit : ");
			amnt=sc.nextDouble();
			obj.deposit(amnt);
			}
		else if(ch==2) {
			System.out.println("Enter the amount to deposit : ");
			amnt=sc.nextDouble();
			obj.withdraw(amnt);
			}
		else if (ch==3)
			obj.disp();
		else
			System.out.println("Wrong value entered");
		System.out.println("Press 1 to deposit amount, 2 to withdraw amount, 3 to display and 4 to exit");
		ch=sc.nextInt();
		}
		sc.close();
	}

}
