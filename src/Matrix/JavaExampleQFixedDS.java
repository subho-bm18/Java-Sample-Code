package Matrix;

import java.util.concurrent.ArrayBlockingQueue;

public class JavaExampleQFixedDS<E> extends ArrayBlockingQueue<E> {
	
	private static final long serialVersionUID = -7772085623838075506L;
	 
	// Size of the queue
	private int size;
 
	public JavaExampleQFixedDS(int size) {
 
		// Creates an ArrayBlockingQueue with the given (fixed) capacity and default access
		super(size);
		this.size = size;
	}
 
	
	@Override
	synchronized public boolean add(E e) {
 
		// Check if queue full already?
		if (super.size() == this.size) {
			// remove element from queue if queue is full
			this.remove();
		}
		return super.add(e);
	}
 

}
