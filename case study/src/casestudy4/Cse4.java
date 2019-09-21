package casestudy4;

import java.util.Scanner;

public class Cse4 {
	public static String[] array = new String[20];
	public static void main(String args[])
    {
	 Scanner sc=new Scanner(System.in);
	 
	 String name;
	 String address,a;
	    String contactNumber;
	    String email;
	    String proofType;
	    String proofID,ans;
	    
	    int i=0;
	    do {

         
        	 System.out.println("Registration");
        	 i++;
        	 System.out.println(" Enter your name");
        	 //name=sc.nextLine();
        	 array[i] = sc.nextLine();
        	 System.out.println(" Enter your address");
        	 address=sc.nextLine();
        	 System.out.println(" Enter your Contact number");
        	 contactNumber=sc.nextLine();
        	 System.out.println(" E-Mail ID");
        	 email=sc.nextLine();
        	 System.out.println(" Enter proof type");
        	 proofType=sc.nextLine();
        	 System.out.println(" Enter proof ID");
        	 proofID=sc.nextLine();
        	 System.out.println(" Thank you for registering. Your id is "+i+"...");
        	System.out.println("Do you want to continue registration? (yes/no)");
            ans=sc.nextLine();
     }
	 while(ans.equalsIgnoreCase("yes"));
	     ViewCustomers(i);
}
	public static void ViewCustomers(int n)
	{int i;
		System.out.println("Customers list");
		System.out.println("The registered customers are");
		System.out.println("Customer IDCustomer name");
		for(i=1;i<=n;i++)
		{
			System.out.println(i+"\t"+array[i]);
		}
		}
	}
