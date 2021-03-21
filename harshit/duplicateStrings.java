package harshit;
import java.util.Scanner;
public class duplicateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		StringBuffer str = new StringBuffer(sc.nextLine());
		String str1 = str.toString();
		char[] arr1 = str1.toCharArray(); 
		for(int i=0;i<str.length();i++)
	    {
	        for(int j=i+1;j<str.length();j++)
	        {
	            if(str1[i]==str1[j])
	            str.delete(j,1);
	        }
	    }
		System.out.println(str);
		sc.close();
	}
}
