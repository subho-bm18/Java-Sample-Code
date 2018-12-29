package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapToArrayListConversionMain {
	 
	 public static void main(String args[])
	 {
	  // HashMap with Country as key and capital as value
	  HashMap<String,String> countryCapitalMap=new HashMap<String,String>();
	  countryCapitalMap.put("India","Delhi");
	  countryCapitalMap.put("Japan","Tokyo");
	  countryCapitalMap.put("France","Paris");
	  countryCapitalMap.put("Russia","Moscow");
	 
	 
	  System.out.println("-----------------------------");
	 
	  // Creating  ArrayList from Keys
	  
	  ArrayList keysArrayList=new ArrayList(countryCapitalMap.keySet());
	  System.out.println("Keys are: ");
	  for (Object country:keysArrayList) {
	 System.out.println(country);
	}
	 
	  System.out.println("-----------------------------");
	 
	  //Creating  ArrayList from Values
	  ArrayList valuesArrayList=new ArrayList(countryCapitalMap.values());
	  System.out.println("Values are: ");
	  for (Object capital:valuesArrayList) {
	 System.out.println(capital);
	}
	  System.out.println("-----------------------------");
	 
	  //Creating  ArrayList from Entry set
	  ArrayList<Entry<String,String>> entryArrayList=new ArrayList<Entry<String,String>>(countryCapitalMap.entrySet());
	  for (Entry<String,String> entry:entryArrayList) {
	   System.out.println("Country:"+ entry.getKey() +" and  Capital:"+entry.getValue());
	 
	  }
	 
	  System.out.println("-----------------------------");
	 
	 }
	 
	}
