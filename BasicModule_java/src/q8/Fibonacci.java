package q8;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.print(0+" ");
		System.out.print(1+" ");
		int a=0,b=1,c=0;
		for(int i=0;i<=n;i++)
		{c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
