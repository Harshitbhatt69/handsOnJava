package harshit;
import java.util.Scanner;
public class findKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the Size of array");
		int size = in.nextInt();
		int arr[] = new int[size+1];
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		System.out.println("Enter the key to be found");
		int key = in.nextInt();
		System.out.println("Enter element to be inserted");
		int ele = in.nextInt();
		boolean flag=false;
		int temp=0,temp1=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				temp = arr[i+1];
				arr[i+1]=ele;
				flag=true;
//				break;
			}
			else if(flag)
			{
				temp1 = arr[i+1];
				arr[i+1] = temp;
				temp = temp1;
			}
		}
		for(int i=0;i<size+1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		in.close();
	}

}
