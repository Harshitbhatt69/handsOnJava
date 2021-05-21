package harshit;

class Runnable2 implements Runnable{
    public void run(){
    	System.out.println("even numbers");
        for(int i=0;i<=21;i++){
          if(i%2==0)
          {
        	  System.out.println(i);
          }
          else
          {
        	  try {
      			Thread.sleep(500);
      			} catch (InterruptedException e) {
      			// TODO Auto-generated catch block
      			e.printStackTrace();
      		}
          }
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
    	System.out.println("Odd numbers");
        for(int i=0;i<=21;i++){
            if(i%2!=0)
            {
            	System.out.println(i);
            }
            else
            {
            	try {
    				Thread.sleep(500);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
            }
        }
    }
}


public class EvenOddThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable1();
        Thread t1 = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
        t1.start();
        
	}

}
