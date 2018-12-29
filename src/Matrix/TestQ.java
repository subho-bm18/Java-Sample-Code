package Matrix;

public class TestQ
{ 
    public static void main(String[] args)  
    { 
        QueueN queue = new QueueN(1000); 
            
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
        
        System.out.println(queue.dequeue() +  
                     " dequeued from queue\n"); 
        
        System.out.println("Front item is " +  
                               queue.front()); 
           
        System.out.println("Rear item is " +  
                                queue.rear()); 
    } 
}
