package Matrix;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class  JavaExampleQImpl{
	static ArrayBlockingQueue<Integer> javaExampleQ = new JavaExampleQFixedDS<Integer>(5);
	public static void main(String[] args) {
		 
		// Test ArrayBlockingQueue with size 10
		for (int i = 1; i <= 7; i++) {
			System.out.println("Enter Element : ");
			Scanner s = new Scanner(System.in);
			int x= s.nextInt();

			addToList(x);
		}
	}
 
	private static void addToList(int n) {
 
		
 
		
		
		try {
			// We are looping for 15 times - No error even after queue is full
			
				javaExampleQ.add(n);
				log("Inserted element in Datastructure " + n);
				printAll(javaExampleQ);
			}
		
		catch (Exception e) {
			log("\nException Occurred: ");
			e.printStackTrace();
		}
			// Will do the same work for printAll() method
			
			
			
		} 
 
	public static void printAll(ArrayBlockingQueue <Integer>javaExampleQ)
	{
		System.out.println("New Array is");
		for (Integer s1:javaExampleQ) {
			System.out.print(s1+",");
		}
	}
 
	private static void log(String abc) {
		System.out.println(abc);
 
	}

}
