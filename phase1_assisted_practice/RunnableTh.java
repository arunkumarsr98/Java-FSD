package phase1_assisted_practice;


	public class RunnableTh implements Runnable {  
		  
	    @Override  
	    public void run() {  
	        System.out.println("Thread has ended");  
	    }  
	   
	    public static void main(String[] args) {  
	    	RunnableTh ex = new RunnableTh();  
	        Thread t1= new Thread(ex);  
	        t1.start();  
	        System.out.println("Good morning,This is a runnable thread");  
	    }  
	} 

