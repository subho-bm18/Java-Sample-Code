package accessModifier2;
import accessModifier.*;

public class AccessDemo2 extends AccessDemo {
	
	public AccessDemo2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		AccessDemo2 objA=new AccessDemo2(20);
		objA.methodA();
		System.out.println("Value of variable a is: "+objA.a);
	}

}
