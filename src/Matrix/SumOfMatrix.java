package Matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfMatrix {
	
	public static void main(String args[]) throws Exception
	{
		int x=0;
		//int y=0;
		int sum=0;
		int ay=0;
		int count=0;
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" enter the number of Rows and columns of the square matrix :");
		x= Integer.parseInt(b.readLine());
		
		
		int by=1;
		/// Creating and Initializing the array
		int arrayA[][]= new int[x][x];
		
		/// Taking the input for Array Elements
		for (int i=0; i<x; i++)
		{
			for ( int j=0; j<x; j++)
			{
				System.out.println("Enter the elemnts");
				arrayA[i][j]=Integer.parseInt(b.readLine());
			}
		}
		
	
	
	//System.out.println(" Sum of the First Boundary Elements is:");
	while(ay<=x && by<=x/2){
		
		System.out.println("The sum of "+count+"th boundary is ");
	for(int i=0;i<x;i++)
	{
		for (int j=0;j<x;j++)
		{
			
				
				if(i==ay||j==ay||i==x-by||j==x-by)
			{
					System.out.println(arrayA[i][j]);
			
			sum=sum+arrayA[i][j]	;//sum needs to be reset for each boundary
			
			
			}
				else
				{
					System.out.println("\t");
				}
			
			
			
		}
	}
	ay=ay++;
	by=by++;
	System.out.println("Sum"+sum);
	count=count+1;
	sum=0;
	}
	}}
