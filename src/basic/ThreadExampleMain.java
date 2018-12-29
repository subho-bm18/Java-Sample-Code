package basic;

public class ThreadExampleMain {
	 
	/* public static void main(String args[])
	 {
	  FirstThread ft= new FirstThread();
	  Thread t=new Thread(ft);
	  t.start();
	 }
	 */
	 
	 
	  public static void main(String args[])
 {
  FirstThread ft= new FirstThread();
  
  Thread t=new Thread(ft);
  t.start();
  long startTime=System.currentTimeMillis();
  try {
                // putting thread on sleep
   Thread.sleep(1000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
  long endTime=System.currentTimeMillis();
  long timeDifference=(endTime-startTime);
  System.out.println("Time difference between before and after sleep call: "+timeDifference);
 }
	  
	 
	}

//https://java2blog.com/object-level-locking-vs-class-level-locking-java
