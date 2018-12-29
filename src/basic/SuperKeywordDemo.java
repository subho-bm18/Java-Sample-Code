package basic;


	
	
	class SuperKeywordDemo extends Person{
	 
		int age;
		
		public SuperKeywordDemo(String name)
		{
			super(name);
			System.out.println("Calling Employee class constructor");
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
			SuperKeywordDemo e1=new SuperKeywordDemo("Arpita");
			
			System.out.println("Employee's name:"+e1.getName());
		}
	}
	 


