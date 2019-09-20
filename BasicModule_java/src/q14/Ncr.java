package q14;

import java.util.Scanner;

public class Ncr {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n  ");
		long n=sc.nextInt();
		long n2=1,r2=1,t2=1,ncr,t;
		System.out.println("Enter the value of r  ");
		int r=sc.nextInt();
		 t=(n-r);
			for(int i=1;i<=n;i++)
			{
				n2=n2*i;}
			for(int i=1;i<=r;i++)
			{
				r2=r2*i;
			}
			for(int i=1;i<=t;i++)
			{
				t2=t2*i;
			}
			
			
			ncr=n2/(t2*r2);
			System.out.println("The NCR factor for given values is "+ncr);
		
	}
}
