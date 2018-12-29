package basic;

abstract class ShapeAbstraction {
	
	
		 
		public void draw()
		{
			System.out.println("Draw method in shape class");
		}
		
		public abstract double calculateArea();
		public static void main(String a[])
		{
			System.out.println("ABCC");
		}
	}
	 
	class Rectangle extends ShapeAbstraction
	{	
		double length;
		double breadth;
		
		
		public Rectangle(double length, double breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}
	 
		@Override
		public double calculateArea() {		
			return length*breadth;
		}
	}
	 
	class Circle extends ShapeAbstraction
	{
	    double radius;
	        
		public Circle(double radius) {
			super();
			this.radius = radius;
		}
	 
		@Override
		public double calculateArea() {
			return 3.14*radius*radius;
		}
	}


