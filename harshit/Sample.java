package harshit;
import java.util.Scanner;
public class Sample {
	static float discount(float precentage, int price)
	{
		float ans = (precentage/(float)100)*price*100;
		return ans;
	}
	static void outputStatement(int price,float precentage)
	{
		System.out.println("Your total bill: " + (price*100) + " After "+ precentage +"% discount, your bill: " + (price*100 - discount(precentage ,price)));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your purchase ammount: ");
		System.out.println("1: 1-100\n2: 101-200\n3: 201-300\n4: Above 300");
		int price = sc.nextInt();	// price
		
		System.out.println("=====================\nSelect:\n1:Mill Cloth\n2:Handloom items");
		int item = sc.nextInt();	// 
		if(item == 1)	//Mill cloth
		{
			if(price==1)
			{
				System.out.println("No discount available.");
			}
			else if(price == 2)
			{
				outputStatement(price,5);
			}
			else if(price == 3)
			{
				outputStatement(price,(float)7.5);
			}
			else if(price == 4)	//assuming max price 400, so taking 10% discount from 400
			{
				outputStatement(price,10);
			}
		}
		else if(item == 2)	//Handloom
		{
			if(price==1)
			{
				outputStatement(price,5);
			}
			else if(price == 2)
			{
				outputStatement(price,10);
			}
			else if(price == 3)
			{
				outputStatement(price,15);
			}
			else if(price == 4)	//assuming max price 400, so taking 10% discount from 400
			{
				outputStatement(price,20);
			}
		}
		sc.close();
	}
}
