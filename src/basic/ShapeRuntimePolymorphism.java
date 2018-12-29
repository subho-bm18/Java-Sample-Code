package basic;

public class ShapeRuntimePolymorphism {
	
	
		 
		public void draw()
		{
			System.out.println("Drawing Shape");
		}
		public static void main(String[] args) {
			
			ShapeRuntimePolymorphism s=new RectanglePoly();
			s.draw();
			
			s=new CirclePoly();
			s.draw();
		}
	 
	}
	class RectanglePoly extends ShapeRuntimePolymorphism
	{
		public void draw()
		{
			System.out.println("Drawing Rectangle");
		}
	}
	 
	class CirclePoly extends ShapeRuntimePolymorphism
	{
		public void draw()
		{
			System.out.println("Drawing Circle");
		}
	}


