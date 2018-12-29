package basic;

public class ThisKeyDemo {
	
	String name;//instance variables
	int age;
	
	public ThisKeyDemo(String name,int age)
	{
		name=name;
		age=age;		
	}
	
	public void workOnAssignment()
	{
		// Working on assignment
		int fdf;
	}
	
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	public static void main(String args[])
	{
		ThisKeyDemo e1=new ThisKeyDemo("John",20);
		System.out.println("Employee's name : "+e1.getName());
		System.out.println("Employee's age : "+e1.getAge());
	}

}
