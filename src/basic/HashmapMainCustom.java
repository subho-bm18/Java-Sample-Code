package basic;

import java.util.HashMap;



/*HashMap has a inner class called Entry which stores key-value pairs.
Above Entry object is stored in Entry[ ](Array) called table
An index of table is logically known as bucket and it stores first element of linkedlist
Key object’s hashcode() is used to find bucket of that Entry object.
If two key object ‘s have same hashcode , they will go in same bucket of table array.
Key object ‘s equals() method is used to ensure uniqueness of key object.
Value object  ‘s equals() and hashcode() method is not used at all*/

public class HashmapMainCustom {
 
	public static void main(String args[])
	{
		// HashMap with Country name as key and capital as value
		// HashMap stores elements in key value pairs
		HashMap<String,String> countryCapitalMap=new HashMap<String,String>();
		countryCapitalMap.put("India","Delhi");
		countryCapitalMap.put("Japan","Tokyo");
		countryCapitalMap.put("France","Paris");
		countryCapitalMap.put("Russia","Moscow");
 
		System.out.println("-----------------------------");
		// Iterating HashMap Using keySet() and for each loop
		System.out.println("Iterating HashMap Using keySet() and for each loop");
		for (String countryKey:countryCapitalMap.keySet()) {
			System.out.println("Country:"+ countryKey +" and  Capital:"+countryCapitalMap.get(countryKey));
 
		}
		System.out.println("-----------------------------");
	}
 
}
