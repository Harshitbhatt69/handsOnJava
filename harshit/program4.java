package harshit;
import java.util.Scanner;
public class program4 {

	public static void main(String[] args) {
		int rep=0;
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[4][4];
		do {
			System.out.println("Select your city:");
			System.out.println("[1] Delhi\n[2] Mumbai\n[3] Chennai\n[4] Kolkatta");
			int city = in.nextInt();
			System.out.println("Select your car");
			System.out.println("[1] Maruti-K10\n[2] Zen-Astero\n[3] Wagnor\n[4] Maruti-SX4");
			int car = in.nextInt();
			arr[city-1][car-1]++;
			System.out.println("Press 1 for repeat");
			rep = in.nextInt();
		}while(rep == 1);
		System.out.println("\t  Maruti-K10\t   Zen-Astero\t       Wagnor  \t      Maruti-SX4");
		for(int i=0;i<4;i++)
		{
			if(i==0)
				System.out.print("Delhi  ");
			else if(i == 1)
				System.out.print("Mumbai ");
			else if(i == 2)
				System.out.print("Chennai");
			else if(i==3)
				System.out.print("Kolkata");
			for(int j=0;j<4;j++)
				System.out.print("       " + arr[i][j]+"          ");
			System.out.println();
		}
		in.close();
	}

}
