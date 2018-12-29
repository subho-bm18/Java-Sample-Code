package Matrix;

public class ThirdH {
	
	int fh,sh,th,temp1,temp2=0;
	
	public int findThirdHighest( int arrayA[])
	{
		
		for (int i=0; i<(arrayA.length);i++)
		{
			if (fh<arrayA[i])
			{
				temp1 = th;
				temp2= sh;
				fh = arrayA[i];
				sh = temp1;
				th = temp2;
			}
			
			else if ( sh < arrayA[i])
			{
				temp2 = sh;
				sh = arrayA[i];
				th = temp2;
				
			}
			
			else if ( th < arrayA[i])
			{
				th = arrayA[i];
				
			}
			
		}
		return th;

	}

	public static void main ( String args [])
	
	{
		ThirdH tth= new ThirdH();
		int a[] = {50,48,90,81,9,2,17,37, 59,101};
		
		int abc=tth.findThirdHighest(a);
		
		System.out.println(abc);
		
	}
}
