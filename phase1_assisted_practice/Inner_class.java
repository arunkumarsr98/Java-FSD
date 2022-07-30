package phase1_assisted_practice;

 class Inner1 {

	 private String msg="Hello"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", This is the inner class 1");}  
	 }  


	public static void main(String[] args) {

		Inner1 obj=new Inner1();
		Inner1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


 class Inner2 {

private String msg="Inner Classes";

void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
 }  
 
 Inner l=new Inner();  
 l.msg();  
}  


public static void main(String[] args) {
	Inner2  ob=new Inner2 ();  
	ob.display();  
	}
}


//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


	public class Inner_class {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}

