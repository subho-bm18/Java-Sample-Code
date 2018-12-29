package basic;


public class AbstractMain {
	
	
		 
		public static void main(String[] args)
		{
			System.out.println("============================");
			Rectangle rec=new Rectangle(40,30);
			rec.draw();
			System.out.println("Area of rectangle is "+rec.calculateArea());
			System.out.println("============================");
		
			Circle cir=new Circle(3);
			cir.draw();
			System.out.println("Area of circle is "+cir.calculateArea());
			System.out.println("============================");
		}

}
