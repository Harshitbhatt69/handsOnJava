package harshit;
class Athread extends Thread{
	public void run() {
		for(int i=1;i<1000;i++)
		System.out.println("From class A "+i);
		System.out.println("Exit from A");
	}
}
class Bthread extends Thread{
	public void run() {
		for(int i=1;i<1000;i++)
		System.out.println("From class B "+i);
		System.out.println("Exit from B");
	}
}
class Cthread extends Thread{
	public void run() {
		for(int i=1;i<1000;i++)
		System.out.println("From class C "+i);
		System.out.println("Exit from C");
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athread a = new Athread();
		Bthread b = new Bthread();
		Cthread c = new Cthread();
		c.setPriority(10);
		b.setPriority(5);
		a.setPriority(1);
		
		System.out.println("Start thread A");
		a.start();
		System.out.println("Start thread B");
		b.start();
		System.out.println("Start thread C");
		c.start();
	}

}
