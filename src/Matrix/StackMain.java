package Matrix;

//Driver code 
class StackMain 
{ 
 public static void main(String args[]) 
 { 
	 StackImplementation s = new StackImplementation(); 
     s.push(10); 
     s.push(20); 
     s.push(30); 
     System.out.println(s.pop() + " Popped from stack"); 
 } 
}