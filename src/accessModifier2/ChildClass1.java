package accessModifier2;

import java.io.IOException;

import Matrix.ParentClass;

public class ChildClass1 extends ParentClass {

	public void getMethod() throws ArrayIndexOutOfBoundsException
	{
		System.out.println(" From Parent Class..");
		throw new ArithmeticException(" Exception");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChildClass1 ch = new ChildClass1();
		ch.getMethod();
		

	}

}
