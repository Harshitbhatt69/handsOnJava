//wap to find out the sum of all n element which are located at even places
package harshit;
import java.util.Scanner;
public class evenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int sum=0;
		for(int i=0;i<n;i=i+2)
		sum+=arr[i];
		System.out.println("Sum of all numbers at even places are: "+sum);
		in.close();
	}

}
