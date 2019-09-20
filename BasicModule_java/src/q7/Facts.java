package q7;

import java.util.Scanner;

public class Facts {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int count=1;
		System.out.println("Enter the number alphabets in your name");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			count=count*i;		
		}
		System.out.println("The number of combination is "+count);
	}
}
