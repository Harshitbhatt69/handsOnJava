package harshit;
import java.util.Scanner;
abstract class card
{
	abstract int check(String str);
}
class mastercard extends card
{
	int check(String str)
	{
		if(str.length()==16)
		{
			if(str.charAt(0)=='5' && (str.charAt(1)>'0' && str.charAt(1)<'6'))
			{
				System.out.println("Valid Master Card !");
				return 1;
			}
		}
		return 0;
	}
}
class visa extends card
{
	int check(String str)
	{
		if(str.length()>12 && str.length()<17)
		{
			if(str.charAt(0)=='4')
			{
				System.out.println("Valid Visa Card !");
				return 1;
			}
		}
		return 0;
	}
}
class americanExtress extends card
{
	int check(String str)
	{
		if(str.length()==15)
		{
			if((str.charAt(0)=='3' && str.charAt(1)=='4') || (str.charAt(0)=='3' && str.charAt(1)=='7'))
			{
				System.out.println("Valid American Extress Card !");
				return 1;
			}
		}
		return 0;
	}
}
public class DebitCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your card number !");
		String card =  sc.nextLine();
		card = card.replaceAll(" ","");
		americanExtress ae = new americanExtress();
		int flag1 = ae.check(card);
		visa vs = new visa();
		int flag2 = vs.check(card);
		mastercard ms = new mastercard();
		int flag3 = ms.check(card);
		if(flag1==0 && flag2==0 && flag3==0)
			System.out.println("Invalid Card Type");
		sc.close();
		}
}
