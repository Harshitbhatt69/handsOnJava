//not in syllabus, just try
package harshit;
import java.util.Scanner;
public class Dubey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter University roll no.: ");
		int univRoll = sc.nextInt();
		
		System.out.print("Semester: ");
		int sem = sc.nextInt();
		sc.next();
		
		System.out.print("Enter course: ");
		String course = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Name:           "+name);
		System.out.println("University roll:"+univRoll);
		System.out.println("Course:         "+course);
		System.out.println("semester        "+sem);
		sc.close();
	}

}
