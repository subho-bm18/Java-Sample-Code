package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmstrongNum {
	
	
	public boolean validateNum(int n)
	{
		
		int temp;
		int c=0;
		int a=0;
		
		temp = n;
		
		while(n>0)
		{
			a = n%10;
			n = n/10;
			c = c + a*a*a;
		}
		
		if ( temp == c)
		  return true;
		else
		  return false;
		
		
	}
	
	
	public static void main ( String args[])
	{
		AmstrongNum aa = new AmstrongNum();
		System.out.println(" Enter Number");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n= Integer.parseInt(b.readLine());
			boolean isArmstrong=aa.validateNum(n);
			System.out.println("Result" + isArmstrong);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
