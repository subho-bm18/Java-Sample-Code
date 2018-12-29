import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
//import Math.random

public class UniqueValues {
	
	int count =0;
	
	
	public int[] getRandom(double max,double min){
		int arr[]= new int[10];
		while(true){
			    for (int i=0;i<10;i++)
			     {
			       double x = (int)(Math.random()*((max-min)+1))+min;
			       arr[i]=(int) x;
				 }
			    break;
			    //int range = (int)(max - min); 
			
	}
		return arr;
	}
	public Set<Integer> getunique( int ab[]){

		Set<Integer> originalSet= new HashSet<Integer>();
		Set<Integer> duplSet= new HashSet<Integer>();
		
		for (int i: ab)
		{
			if(!originalSet.add(i))
			{
				duplSet.add(i);
			}
		}
		
		return originalSet;

}

	public static void main(String args[])
	{
		
		UniqueValues ub= new UniqueValues();
		int abc[]=ub.getRandom(10, 20);
		//int ab[]={1,2,3,4,5};
		Set<Integer> uniq=ub.getunique(abc);
		System.out.println("Unique list"+uniq);
		
	
}
}