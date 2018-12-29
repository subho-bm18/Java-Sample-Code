package Matrix;

public class ThirHighest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {30,5,69,1,55, 78,90};
		int temp=0;
		
		for (int i=0; i<a.length;i++)
		{
			for(int j=1; j<(a.length-i);j++)
			{
				if(a[j-1]>a[j])
				
				temp=a[j-1];
				a[j-1]=a[j];
			    a[j]=temp;
			}
		}
		
		
		System.out.println(a[a.length-3]);

	}

}
