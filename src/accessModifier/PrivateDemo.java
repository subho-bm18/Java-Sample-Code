package accessModifier;

public class PrivateDemo {
	
	private int a;
	
	PrivateDemo(int a)
	{
		this.a=a;
	}
	private void methodA()
	{
		System.out.println("In method of class A");
	}
}
class B {
 
	public static void main(String args[])
	{
		PrivateDemo objA=new PrivateDemo(20);
		//objA.methodA();/*This variable is not visible as it is private*/
		//System.out.println("Value of variable a is: "+objA.a);
	}
}
