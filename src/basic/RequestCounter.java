package basic;

public class RequestCounter {
	 
	 private int count;
	 
	 public synchronized int incrementCount()
	 {
	  count++;
	  return count;
	 }
	}

/*
 private int count;
 
 public int incrementCount() {
  synchronized (this) {
   count++;
   return count;
  }
 }
 */
