package basic;
import java.util.HashMap;

public class HashMapDemo {
	
	
	 
	
	 
		public static void main(String[] args) {
			HashMap<Integer, String> employeeHashmap = new HashMap<Integer, String>();
			employeeHashmap.put(1, "Arpita");
			employeeHashmap.put(2, "Johny");
			employeeHashmap.put(3, "Martin");
			employeeHashmap.put(4, "Vaibhav");
	 
			// Iterating HashMap Using keySet() and for each loop
			System.out.println("Iterating HashMap Using keySet() and for each loop");
			System.out.println("-----------------------------");
			for (Integer empId : employeeHashmap.keySet()) {
				System.out.println("EmpId:" + empId + " and  Emp Name:" + employeeHashmap.get(empId));
	 
			}
			System.out.println("-----------------------------");
		}
	}

