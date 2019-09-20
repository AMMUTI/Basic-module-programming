package q11;

import java.util.Scanner;

public class max {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bowlers : ");
		int n=sc.nextInt();
		System.out.println("Enter the number of fouls made by each player : ");
		int a[] = new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("The winning bid is "+max+" crores");
	}
}
