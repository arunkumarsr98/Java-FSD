package practice;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;

public class Movie_Booking{
	public static void main(String[] args) {
 				LinkedList<String> Z=new LinkedList<String>();
 				LinkedList<String> Y=new LinkedList<String>();
 				LinkedList<String> X=new LinkedList<String>();
 				LinkedList<String> W=new LinkedList<String>();
// 				LinkedList<String> E=new LinkedList<String>();
 				for(int i=0;i<10;i++){
 					Z.add("1");
 					Y.add("1");
 					X.add("1");
 					W.add("1");
 	 				}
 			
 				for(int i=0;i<6;i++){
 					Y.set(i,"0");
 				}
 				for(int i=0;i<10;i++){
 					if(i%5==0){
 					X.set(i,"1");}
 				}
 				for(int i=0;i<10;i++){
 					if(i%2==0){
 					W.set(i,"0");}
 				}
 				Scanner sc=new Scanner(System.in);
 				System.out.println("\t\t\tABC Cinemas");
 				System.out.println("Press A to update your password (Only if you're a Admin)\nPress B to book tickets");
 				char ch=sc.next().charAt(0);
 				while(ch!='A'&&ch!='B')
 				{
 					System.out.println("You selected incorrect option, choose correct option");
 					System.out.println("Press A to update your password (Only if you're a Admin)\nPress B to book tickets");
 					ch=sc.next().charAt(0);
 				}
 				String pass,s1;
 				switch (ch)
 				{
 				case 'A':
 				{
 					System.out.println("Press Y if you want to update your password\nIf not,Else press N");
 					ch=sc.next().charAt(0);
 					while(ch!='Y'&&ch!='N')
 					{
 						System.out.println("You selected incorrect option, choose correct option");
 						System.out.println("Do you want to update your password? \n If yes press 'Y', if no press 'N'");
 						ch=sc.next().charAt(0);
 					}
 					if(ch=='Y')
 					{
 						System.out.println("Enter current password");
 						sc.nextLine();
 						pass=sc.nextLine();
 						System.out.println("Enter new password");
 						pass=sc.nextLine();
 						System.out.println("Confirm new password");
 						s1=sc.nextLine();
 						while(!(pass.equals(s1))){
 							System.out.println("Password Incorrect");
 							System.out.println("Try again, Enter new password");
 	 						pass=sc.nextLine();
 	 						System.out.println("Re-enter to confirm new password");
 	 						s1=sc.nextLine();
 						}
 						System.out.println("Password updated successfully");
 					}
 					else
 					{
 						System.out.println("End of application");
 					}
 					break;
 					
 				}
 				case 'B':
 				{
 					System.out.println("\t\tWelcome user :-)");
 					System.out.println("Choose your timings: ");
 					getTime user=new getTime();
 					System.out.println("Choose from the available seats");
 					LinkedList<String> a= new LinkedList<>(); 
 					for(int i=0;i<10;i++){
 						if(Z.get(i)=="0"){
 							a.add("Z"+(i+1));
 							System.out.print("Z"+(i+1)+" ");
 						}
 					}
 					for(int i=0;i<10;i++){
 						if(Y.get(i)=="0"){
 							a.add("Y"+(i+1));
 							System.out.print("Y"+(i+1)+" ");
 						}
 					}
 					for(int i=0;i<10;i++){
 						if(X.get(i)=="0"){
 							a.add("X"+(i+1));
 							System.out.print("X"+(i+1)+" ");
 						}
 					}
 					for(int i=0;i<10;i++){
 						if(W.get(i)=="0"){
 							a.add("W"+(i+1));
 							System.out.print("W"+(i+1)+" ");
 						}
 					}
 			
 					System.out.println("\nEnter your seats count");
 					int seatsCount=sc.nextInt();
 					String arr[]=new String[seatsCount];
 					System.out.println("Select the seats");
 					for(int i=0;i<seatsCount;i++){
 						arr[i]=sc.next();
 						while(!(a.contains(arr[i]))){
 							System.out.println("select the appropriate seat");
 							arr[i]=sc.next();
 						}
 					}
 					System.out.println("Net amount ₹"+(seatsCount*100)+".00"+"\n \tPress 1 to book selected ticket\n\tPress 2 to cancel the ticket(s)");
 					int y=sc.nextInt();
 					int price=100;
 					sc.nextLine();
 					String name;
 					long no;
 					if(y==1){
 						int b2=user.a;
 						System.out.println("Please enter your name ");
 						name=sc.nextLine();
 
 						System.out.println("Name: "+name+"\nmovie timing: "+user.showTime()+"\ntotal seats "+seatsCount);
 						System.out.print("Selected seats: ");
 	 					for(int i=0;i<seatsCount;i++){
 	 						System.out.print(arr[i]+" ");
 	 					}
 	 					System.out.println("\nAmount to be paid "+(seatsCount*price)+"\nFor confirmation type 1 book seats: ");
 	 					int confirm=sc.nextInt();
 	 					while(confirm!=1){
 	 						System.out.println("Unsuccessful");
 	 						System.out.println("For confirmation type YES book seats: ");
 	 						confirm=sc.nextInt();
 	 					}
 	 					System.out.println("Booking successful\nEnjoy your show.Thank you");
 					}
 					else {
 						
 						System.out.println("Tickets are not booked.");
 					}
 			}
   	} 
 				}
	}
 			
class getTime{
	int a;
	HashMap<Integer,String> hm=new HashMap<>();
	getTime(){
		System.out.println("1.  10.30 AM  2.  2.30 PM  3.  6.30 PM  4.  10.30 PM");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=1&&a!=2&&a!=3&&a!=4){
			System.out.println("Select ONLY from the timings available");
			System.out.println("1.  10.30 AM  2.  2.30 PM  3.  6.30 PM  4.  10.30 PM");
			a=sc.nextInt();
		}
		hm.put(1,"10.30 AM");
		hm.put(2,"2.30 PM");
		hm.put(3,"6.30 PM");
		hm.put(4,"10.30 PM");
	}
		String showTime(){
			return(hm.get(a));
		}
}
