package harshit;
import java.util.ArrayList;
import java.util.List;
class Producer implements Runnable{
	List l1;
	Producer(List l)
	{
		l1 = l;
	}
	public void run()
	{
		int num=1;
		while(true)
		{
		try {
			produce(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		num++;
		}
	}
	private void produce(int num) throws InterruptedException
	{
		synchronized (l1) {
			if(l1.size()==10)
			{
				System.out.println("Queue is full plz wait...");
				l1.wait();
			}
			Thread.sleep(1000);
			l1.add(num);
			System.err.println("Added number "+ num);
			l1.notifyAll();
		}
	}
}
class Consumer implements Runnable {
	List l1;
	Consumer(List l)
	{
		l1 = l;
	}
	public void run()
	{
		while(true)
		{
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		private void consume() throws InterruptedException {
			synchronized (l1) {
				if(l1.size()==0)
				{
					System.out.println("Queue is empty, waiting...");
					l1.wait();
				}
				Thread.sleep(1000);
				int ele = (int) l1.remove(0);
				System.out.println("Removed element: "+ ele);
				l1.notifyAll();
			}
		}
}
public class ProducerAndConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1 = new ArrayList();
		Producer p1 = new Producer(l1);
		Consumer c1 = new Consumer(l1);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
	}

}
