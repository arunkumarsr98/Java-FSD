package practice;
import java.util.ArrayList;
import java.util.*;  
public class Email_validation {
	 public static void main(String[] args){
	      ArrayList <String> email = new ArrayList<String>();
	      System.out.println("\t\tE-Mail Validation");
	      email.add("marvel@mail.com");
	      email.add("hulk@mail.com");
	      email.add("panther@mail.com");
	      email.add("blackpanther@mail.com");
	      email.add("thor@mail.com");
	      email.add("mightythor@mail.com");
	      email.add("tony@mail.com");
	      email.add("tonystark@mail.com");
	      email.add("strange@mail.com");
	      Scanner scan= new Scanner(System.in);   
	      System.out.print("Enter a keyword (Substring) to find a mail: ");  
	      String input= scan.nextLine(); 
	      System.out.println("E-mail Id which matches your keywords are: ");
	      for (String ToFind : email){
	         if (ToFind.contains(input)){
	        	 
	               System.out.println("\n\t\t"+ToFind);
	         }
	      }
	   }
}
