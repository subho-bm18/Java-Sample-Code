package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringValidation {

	public int isStr2isSubstringofStr1(String str1, String str2)
	{
		int x = str1.length();
		int y = str2.length(); 
		
		//slide one by one part in loop
		for (int k = 0 ; k <= (y-x); k++ )
			
		{
			//check for pattern match
			for ( int l= 0 ; l< x; l++)
			{
				if ( str2.charAt(k+l) != str1.charAt(l))
				{
					break;//breaking the loop here if not mtch
				}
				
				if(l==x-1)
				{
					return k;
				}
			}
		}
		
		return -1;
	}
	
	public static void main ( String args[])
	{
		SubStringValidation sv = new SubStringValidation();
		
		try {
			System.out.println(" Enter the first string");
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			String s1 = b.readLine();
			System.out.println(" Enter the Second string");
			BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
			String s2 = b2.readLine();
			int result= sv.isStr2isSubstringofStr1(s1,s2);
			
			if(result ==-1)
			System.out.println("Not a substring");
			else
				System.out.println("It is a a substring");
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
