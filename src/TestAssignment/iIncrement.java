package TestAssignment;

public class iIncrement {

	public static void main(String args[])
	{
		for (int i = 0; ; i++) // wait for overflow
		{
			System.out.println(i);
		  if (i >= -100 && i <= -1)
		  {
		      System.out.println(-i);
		  }
		  if (i == -1)
		  {
		      break;
		  }
		}
	}
}
