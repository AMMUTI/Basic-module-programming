package q13;

import java.util.Scanner;

public class Sumjava {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number  ");
		int n=sc.nextInt();
		int sum=0;
		
		if (n<0)
		{
			System.out.println("Enter the number  ");
			 n=sc.nextInt();
		}
	   
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
		}
}
