package accessModifier2;

import java.io.IOException;

import Matrix.ParentClass;

public class ChildClass2 extends ParentClass {

	public void getMethod() throws NullPointerException
	{
		System.out.println(" From Parent Class..");
		throw new NullPointerException(" Exception");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChildClass2 ch = new ChildClass2();
		ch.getMethod();
		

	}

}
