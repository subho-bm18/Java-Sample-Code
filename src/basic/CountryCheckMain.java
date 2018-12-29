package basic;

import java.util.ArrayList;
import java.util.List;
 
public class CountryCheckMain {
 
 public static void main(String args[]) {
  List <Country>countries = new ArrayList<Country>();
  Country indiaCountry = new Country("India");
  Country chinaCountry = new Country("China");
  Country nepalCountry = new Country("Nepal");
  Country bhutanCountry = new Country("Bhutan");
  countries.add(indiaCountry);
  countries.add(chinaCountry);
  countries.add(nepalCountry);
  countries.add(bhutanCountry);
  boolean safe;
  try {
   safe = checkListOfCountries(countries);
   if (safe)
    System.out.println("We don't have USA in list of Countries");
   Country USACountry = new Country("USA");
   countries.add(USACountry);
   checkListOfCountries(countries);
  } catch (InvalidCountryException e) {
   e.printStackTrace();
  }
 
 }
 
 public static boolean checkListOfCountries(List countries) throws InvalidCountryException {
  for (int i = 0; i < countries.size(); i++) {
   Country country = (Country) countries.get(i);
   if (country.getName().equals("USA")) {
    throw new InvalidCountryException("USA is not allowed");
   }  
  }
  return true;
 }
}
 

