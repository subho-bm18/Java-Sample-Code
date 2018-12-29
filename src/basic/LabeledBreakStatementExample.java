package basic;

public class LabeledBreakStatementExample {
	 
	public static void main(String[] args) {
		LabeledBreakStatementExample bse = new LabeledBreakStatementExample();
		int arr[][] = { { 32, 45, 35 }, { 53, 65, 67 }, { 43, 23, 76 } };
		bse.findElementInArr(arr, 65);
	}
 
	public void findElementInArr(int arr[][], int elementTobeFound) {
		outer: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
 
				if (arr[i][j] == elementTobeFound) {
					System.out.println(elementTobeFound + " is present in the array ");
					break outer; // labeled break statement is encountered, control will exit
							// outer loop now
				}
			}
		}
		System.out.println("Executing statements following the outer loop");
	}
 
}
