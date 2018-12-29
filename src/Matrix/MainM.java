package Matrix;

import java.util.*; 

class MainM 
{  
    // This function prints frequencies of all elements 
    static void printFreq(int arr[]) 
    { 
        // Creates an empty HashMap 
        HashMap<Integer, Integer> hmap =  
                     new HashMap<Integer, Integer>(); 
  
        // Traverse through the given array 
        for (int a:arr) 
        { 
        		if(hmap.containsKey(a))
            // If this is first occurrence of element  
                   hmap.put(a, hmap.get(a)+1); 
  
            // If elements already exists in hash map 
            else 
              hmap.put(a,1 ); 
        } 
  
        // Print result 
        for (Map.Entry m:hmap.entrySet()) 
          System.out.println("Frequency of " + m.getKey() +  
                             " is " + m.getValue()); 
    } 
  
    // Driver method to test above method 
    public static void main (String[] args) 
    { 
        int arr[] = {10, 34, 5, 10, 3, 5, 10}; 
        printFreq(arr); 
    } 
} 