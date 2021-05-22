package harshit;
import java.io.*;
import java.util.Scanner;

public class ObjSerialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("empfile");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("Serialization");
		System.out.println("Enter how many object to be entered");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Employ e1 = Employ.getdata();
			oos.writeObject(e1);
		}
		oos.close();
		fos.close();
		
		System.out.println("De-serialization");
		FileInputStream fis = new FileInputStream("empfile");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			Employ e;
			while((e = (Employ)ois.readObject())!=null)
			{
				e.display();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("End of file...");
		}
		finally {
			fos.close();
			oos.close();
		}
	}
}
 class Employ implements Serializable
 {
	 private int id;
	 private String name;
	 private float salry;
	 Employ(int i, String n,float s)
	 {
		 id = i;
		 name = n;
		 salry = s;
	 }
	 void display()
	 {
		 System.out.println(id+" : "+name+" : "+salry+"\t");
	 }
	 
	 static Employ getdata()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter id");
		 int id = sc.nextInt();
		 System.out.println("Enter name");
		 String name = sc.next();
		 System.out.println("Enter salary");
		 int salry = sc.nextInt();
		 Employ e = new Employ(id,name,salry);
		 return e;
	 }
 }
