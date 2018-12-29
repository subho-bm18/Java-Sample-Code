package accessModifier2;

import accessModifier.AccessDemo;

public class ProtectedDemo extends AccessDemo {
	
	void getMethod() throws Exception
	{
		System.out.println(" From Parent Class..");
		throw new Exception(" Exception");
	}
		 
	ProtectedDemo(int a) {
			super(a);		
		}
	 
		public static void main(String args[])
		{
			ProtectedDemo ObjB=new ProtectedDemo(20);
			ObjB.methodA();
			System.out.println("Value of variable a is: "+ObjB.a);
		}

}
