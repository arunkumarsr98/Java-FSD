package phase1_assisted_practice;

public class Sleep_Wait {
	
	private static Object lock = new Object();
	    public static  void main(String args[]) throws InterruptedException
	    {
	    	
	        Thread.sleep(5000);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 5 seconds");
	        synchronized (lock) 
	        {
	            lock.wait(1000);
	            System.out.println("Object '" + lock + "' is woken after" + " waiting for 5 seconds");
	        }
	    }
	}


