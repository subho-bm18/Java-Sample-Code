package basic;

public class Constructor {
	
	
	   String name;
		int age;
		
		public Constructor(String name,int age)
		{
			System.out.println("Calling Parameterized constructor");
			this.name=name;
			this.age=age;		
		}
		public void workOnAssignment()
		{
			// Working on assignment
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
			Constructor e1=new Constructor("John",20);
			System.out.println(e1.getName());
			System.out.println(e1.getAge());
		}
	}


