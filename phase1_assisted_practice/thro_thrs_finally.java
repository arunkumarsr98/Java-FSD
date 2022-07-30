package phase1_assisted_practice;

import java.util.Scanner;

public class thro_thrs_finally {
	
        public static void main(String[] args)
        {

            int a=45,b=0,rs,rs1=0;
            Scanner sc= new Scanner(System.in);
            System.out.print("Your choice: ");  
  		  	int n= sc.nextInt();
  		 
  		  	
  		  

switch (n)
{
case 1:
{
	System.out.print("Throw"); 
	try
    {
        if(b==0)        
            throw(new ArithmeticException("Can't divide by zero."));
        else
        {
            rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
    }
    catch(ArithmeticException Ex)
    {
        System.out.print("\n\tError : " + Ex.getMessage());
    }

    System.out.print("\n\tEnd of program.");
    break;
}
case 2:
{
	System.out.print("Throw"); 
	 thro_thrs_finally T = new thro_thrs_finally();

          try
         {
             T.Division();
         }
         catch(ArithmeticException Ex)
         {
             System.out.print("\n\tError : " + Ex.getMessage());
         }
         System.out.print("\n\tEnd of throws program.");
         break;
     }
case 3:
{
	System.out.print("Finally"); 
	try
    {
        rs = a / b;
    }
    catch(ArithmeticException Ex)
    {
        System.out.print("\n\tError : " + Ex.getMessage());
    }
    finally
    {
        System.out.print("\n\tThe result is : " + rs1);
    }

}

}
}
            
       //Throws method 
        void Division() throws ArithmeticException
        {
            int a=45,b=0,rs;
    rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
    }


