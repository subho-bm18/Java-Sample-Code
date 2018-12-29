package basic;

public class BookWriter implements Runnable{
	 
	 Book book;
	 
	 public BookWriter(Book book) {
	  super();
	  this.book = book;
	 }
	 
	 @Override
	 public void run() {
	  synchronized (book) {
	   System.out.println("Author is Starting book : " +book.getTitle() );
	   try {
	    Thread.sleep(1000);
	   } catch (InterruptedException e) {
	    e.printStackTrace();
	   }
	   book.setCompleted(true);
	   System.out.println("Book has been completed now");
	   
	   book.notify();
	   System.out.println("notify one reader");
	  
	  } 
	 }
	}

/*
  Book book;
 
 public BookWriter(Book book) {
  super();
  this.book = book;
 }
 
 @Override
 public void run() {
  synchronized (book) {
   System.out.println("Author is Starting book : " +book.getTitle() );
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   book.setCompleted(true);
   System.out.println("Book has been completed now");
   
   book.notifyAll();
   System.out.println("notify readers");
  
  }
 }
 
} */
