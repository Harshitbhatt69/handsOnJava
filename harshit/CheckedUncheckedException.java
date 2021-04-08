package harshit;

public class CheckedUncheckedException {
	void m()
	{ 
	int data=50/0; 
	} 
	void n(){
	m(); 
	} 
	void p(){ 
	try{
	n(); 
	}
	catch(Exception e){
	System.out.println("EXCEPTION HANDLED!!");
	} 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedUncheckedException obj=new CheckedUncheckedException(); 
		obj.p(); 
		System.out.println("NORMAL FLOW..........");
	}

}
