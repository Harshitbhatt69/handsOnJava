package harshit;
import java.util.Scanner;
public class countOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		StringBuffer str = new StringBuffer();
		str.append(sc.nextLine());
		System.out.println("Enter the substring: ");
		StringBuffer key = new StringBuffer();
		key.append(sc.nextLine());
		int ans=0,count=0;
		for(int i=0;i<=str.length()-key.length();i++)
		{
			for(int j=i;j<key.length();j++)
			{
				if(str.substring(i,i+key.length())==key.substring(0,key.length()))
				{
					count++;
				}
			}
			if(count==key.length())
				ans++;
		}
		System.out.println(str.substring(1,6));
		sc.close();
	}

}
