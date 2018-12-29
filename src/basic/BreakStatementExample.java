package basic;


	
	public class BreakStatementExample {
		 
		public static void main(String[] args) {
			BreakStatementExample bse=new BreakStatementExample();
			int arr[] ={32,45,53,65,43,23};
			bse.findElementInArr(arr, 53);
		}
		
		public void findElementInArr(int arr[],int elementTobeFound)
		{
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==elementTobeFound)
				{
					System.out.println(elementTobeFound+" is present in the array ");
					break;  // break statement is encounter, control will exit current loop now
				}
			}
			System.out.println("Executing statments following the loop");
		}
	 
	}


