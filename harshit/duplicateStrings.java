package harshit;
import java.util.*;
class duplicateStrings 
{
	static String removeDup (char str[], int n) 
	{
		int index = 0; 
		for (int i = 0; i < n; i++)
		{
			int j;
			for (j = 0; j < i; j++)
			{	    
				if (str[i] == str[j])
				{	
					break;	      
				} 
			}
			if (j == i) 
			{ 
				str[index++] = str[i];
			} 
		} 
		return String.valueOf(Arrays.copyOf(str, index)); 
	} 
 public static void main(String[] args) 
 	{  
	 	Scanner sc= new Scanner(System.in); 
	 	System.out.print("Enter a string: "); 
	 	String str1= sc.nextLine();
	 	char[] str = str1.toCharArray();
	 	int n = str.length; 
	 	System.out.println("After removing the duplicate letters:\n"+removeDup(str, n)); 
	 	sc.close();
 	} 
}
