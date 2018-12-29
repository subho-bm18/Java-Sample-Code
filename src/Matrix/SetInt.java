package Matrix;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetInt {
	public static void main(String a[])
	{
	//Scanner sc= new Scanner(System.in);
	//int i= sc.nextInt();
	int aa[]= { 2,3,5,2,6,7,5,9,10,14,9};
	
	Set<Integer> si= uniqueElement(aa);
	System.out.println("Unique"+si);

	}
	public static Set<Integer> uniqueElement(int arrayA[]){
		
		Set<Integer> originalSet= new HashSet<Integer>();
		Set<Integer> duplSet= new HashSet<Integer>();

		for (int abc:arrayA)
		{
			if(!originalSet.add(abc))
			{
				duplSet.add(abc);
			}
		}
		return originalSet;
	}

}
