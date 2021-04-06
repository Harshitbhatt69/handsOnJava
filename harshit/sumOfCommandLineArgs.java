package harshit;

public class sumOfCommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int invalid=0,valid=0;
		for(int i=0; i<args.length; i++){
		   try {
			   num+= Integer.parseInt(args[i]);
			   valid++;
		} catch (Exception e) {
			// TODO: handle exception
			invalid++;
		}
		}
		 System.out.println("The sum is " + num);
		 System.out.println("Valid args: "+valid);
		 System.out.println("Invalid args: "+invalid);
	}

}
