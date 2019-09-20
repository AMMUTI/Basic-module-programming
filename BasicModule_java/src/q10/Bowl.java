package q10;

import java.util.Scanner;

public class Bowl {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bowlers : ");
		int n=sc.nextInt();
		float c,avg=0;
		int count=0;
		System.out.println("Enter the runs conceded by the bowlers : ");
		float run[] = new float[n];
		for(int i=0;i<n;i++)
		{
			run[i] = sc.nextFloat();
		}
		System.out.println("Enter the number of balls for each bowler : ");
		float bowls[] = new float[n];
		for(int i=0;i<n;i++)
		{
			bowls[i] = sc.nextFloat();
		}
		System.out.println("Economy of the bowlers is :");
		for(int i=0;i<n;i++)
		{
			c = bowls[i]/6;
			run[i]=run[i]/c;
			System.out.println(run[i]);
		}
	  for(int i=0;i<n;i++)
		{
			avg=avg+run[i];
		}
		avg=avg/n;
		System.out.println("The overall economy of the teanm is "+avg);
		
		for(int i=0;i<n;i++)
			
		{
			if(run[i]<6)
			{
			 count++;
		    }
	  }
		System.out.println("The overall economy of the teanm is "+count);
		}
	}
