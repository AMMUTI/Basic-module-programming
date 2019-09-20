package fifth;

import java.util.Scanner;

public class Avg {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF STUDENTE: ");
		int n =sc.nextInt();
		int temp = 0;
		System.out.println("Enter the marks of students: ");
		
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			temp = temp + a[i];
		}
		temp=temp/n;
		System.out.println("The average is :"+temp);
		
	}

}
