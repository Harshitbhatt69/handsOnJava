package harshit;
public class UsingSuper
{
  
public static void main (String[]args)
  {
    
DerC ob = new DerC ();

} 
} 
class BaseD
{
  
BaseD ()
  {
    
System.out.println ("Constructor of class Base");
  
} 
BaseD (int x) 
  {
    
System.out.println ("number inside baseclass :" + x);
  
} 
void Display ()
  {
    
System.out.println ("Content of derived class ");

} 
} 
class DerC extends BaseD

{
  
DerC ()
  {
    
super (87);
    
super.Display ();
    
System.out.println ("constructor of class Derived");

} 
}
