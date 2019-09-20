package q17;

import java.util.Scanner;

public class Sculptors {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kgs of gold  ");
		int n=sc.nextInt();
		int t,sum=n;
		t=n;
		while(t>5)
		{ t=t/5;
			sum=sum+t;
		}
		System.out.println("Number of Sculptors can be made is "+sum);
	}
}
