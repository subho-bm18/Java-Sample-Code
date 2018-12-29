package basic;

public class MethodOverloadingExample {
	public void method1(int a)
	{
		System.out.println("Integer: "+a);
	}
	public void method1(double b)
	{
		System.out.println("Double "+b);
	}
	public void method1(int a, int b)
	{
		System.out.println("Integer a and b:"+a+" "+b);
	}
	public static void main(String args[])
	{
		MethodOverloadingExample moe=new MethodOverloadingExample();
		moe.method1(20);
		moe.method1(30.0);
		moe.method1(20, 30);
	}
}
