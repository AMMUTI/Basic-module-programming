package q16;

import java.util.Scanner;

public class Vehicles {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vehicles  ");
		int n=sc.nextInt();
		System.out.println("Enter the fare collected for each vehicles  ");
		int a[]= new int[n];
		int h=0,l=0;
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			if(a[i]!=0) 
			{
				if(a[i]>50)
					h++;
					else
						l++;
			}
			
		}
		System.out.println("Number of heavy vehicles "+ h+" and the number of light weight vehicles is "+ l);
	}

}
