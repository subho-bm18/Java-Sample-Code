package Matrix;

public class StackImplementation {

/* Java program to implement basic stack 
operations */

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    StackImplementation() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX-1)) 
        { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else
        { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) 
        { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else
        { 
            int x = a[top--]; 
            return x; 
        } 
    } 
} 
  
// Driver code 


