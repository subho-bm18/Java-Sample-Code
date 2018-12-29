package basic;

import java.util.HashSet;

public class HashSetCountryMain {
 
 public static void main(String[] args)
 {
  HashSet countrySet=new HashSet();
  CountryHashSet india1=new CountryHashSet();
  india1.setName("India");
 
  CountryHashSet india2=new CountryHashSet();
  india2.setName("India");
  
  countrySet.add(india1);
  countrySet.add(india2);
   
  System.out.println("size of nameSet="+countrySet.size());
  System.out.println(countrySet);
  
 }
}

