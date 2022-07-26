package practice;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
	      double num1;
	      double num2;
	      double ans;
	      char choice;
	      Scanner reader = new Scanner(System.in);
	      System.out.print("\t\tArithmetic Calculator\n1->Addition\n2->Subtraction\n3->Multiplication\n4->Division\nChoose the operation: ");
	      choice = reader.next().charAt(0);
	      System.out.print("Enter number 1 : ");
	      num1 = reader.nextDouble();
	      System.out.print("Enter number 2 : ");
	      num2 = reader.nextDouble();
	      switch(choice) {
	         case '1': 
	        	 System.out.print("Operation: Addition");
	        	 ans = num1 + num2;
	            break;
	         case '2': 
	        	 System.out.print("Operation: Subtraction");
	        	 ans = num1 - num2;
	            break;
	         case '3': 
	        	 System.out.print("Operation: Multiplication");
	        	 ans = num1 * num2;
	            break;
	         case '4': 
	        	 System.out.print("Operation: Division");
	        	 ans = num1 / num2;
	            break;
	      default: System.out.println("Try again by choosing correct operation");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      System.out.printf(" " + ans);
	   }
}
