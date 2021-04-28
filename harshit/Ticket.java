package harshit;
class threatre extends Thread{
	String str;
	threatre(String str)
	{
		this.str = str;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(str + ":" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threatre obj1 = new threatre("Cut Ticket");
		threatre obj2 = new threatre("Show Ticket");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		
	}

}
