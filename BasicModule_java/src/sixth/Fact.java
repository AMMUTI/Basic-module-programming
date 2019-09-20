package sixth;

import java.util.Scanner;

public class Fact {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int count=0;
		System.out.println("Enter the number of students");
		int n= sc.nextInt();
		System.out.println("Enter the marks of students");
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			if(a[i]<50)
				count++;
		}
		System.out.println("Number of students appearing for retest is "+count);
	}

}
