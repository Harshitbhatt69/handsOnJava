package harshit;
import java.util.Scanner;
public class temperatureRecorder {

	public static void main(String[] args) {
		int temperature[][] = new int [10][5];
		Scanner sc = new Scanner(System.in);
		int max=-1000;
		int min=1000;
		String city[] = {"Delhi","Mumbai","Kolkatta","Chennai","Dehradun"};
		for(int  i=0;i<10;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("Enter temperature of day "+ (i+1) + " in "+city[j]);
				temperature[i][j] = sc.nextInt();
				if(temperature[i][j] > max)
				{
					max = temperature[i][j];
				}
				if(temperature[i][j] < min)
				{
					min = temperature[i][j];
				}
			}
		}
		boolean flag=false,flag2=false;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(temperature[i][j] == max)
				{
					System.out.println("Maximum temperature: "+max+" in "+city[j]);
					flag=true;
				}
				if(temperature[i][j] == min)
				{
					System.out.println("Minimum temperature: "+min+" in "+city[j]);
					flag2=true;
				}
				if(flag && flag2)
					break;
			}
			if(flag && flag2)
				break;
		}
		sc.close();
	}

}
