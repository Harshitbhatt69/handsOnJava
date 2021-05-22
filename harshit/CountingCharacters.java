package harshit;
import java.io.FileInputStream;
import java.io.IOException;

public class CountingCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream fc = new FileInputStream("D:\\codes\\java\\CSEI\\src\\harshit\\hey.txt");
	        int n = fc.available();
	        int words=0, chars=n, lines=0;
	        for(int i=0;i<n;i++){
	            char ch = (char)fc.read();
	            if(ch == '\n')
	                lines++;
	            else if (ch == ' ')
	                words++;
	        }
	        System.out.println("Number of Characters = "+chars);
	        System.out.println("Number of Words = "+words);
	        System.out.println("Number of Lines = "+lines);
	}

}
