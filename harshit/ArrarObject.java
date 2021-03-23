package harshit;
class S{
	String name;
	S(String name){
		this.name=name;
	}
	void Display() {
		System.out.println("Student name is:"+name+"\n");
	}
}

public class ArrarObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S [] ob=new S[2];
		ob[0]=new S("Hiiii");
		ob[1]=new S("Youu!!");
		ob[0].Display();
		ob[1].Display();
		}

}
