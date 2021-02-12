package harshit;
import java.util.Scanner;
public class program5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[5][5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of salesman quater by quater");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<4;i++)
		{
			int rowTotal=0;
			for(int j=0;j<4;j++)
			{
				rowTotal+=arr[i][j];
			}
			arr[i][4]=rowTotal;
		}
		
		for(int i=0;i<5;i++)
		{
			int colTotal=0;
			for(int j=0;j<5;j++)
			{
				colTotal+=arr[j][i];
			}
			arr[4][i]=colTotal;
		}
		System.out.println("\t   Quater1   Quater2   Quater3   Quater4     Total ");
		for(int i=0;i<5;i++)
		{
			if(i==0)
				System.out.print("Salesman1  ");
			else if(i==1)
				System.out.print("Salesman2  ");
			else if(i==2)
				System.out.print("Salesman3  ");
			else if(i==3)
				System.out.print("Salesman4  ");
			else if(i==4)
				System.out.print("Total      ");
			for(int j=0;j<5;j++)
			{
				System.out.print("    "+arr[i][j]+"     ");
			}
			System.out.println();
		}
		sc.close();
	}
	
}
