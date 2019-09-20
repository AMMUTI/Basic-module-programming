package third;

import java.util.Scanner;

public class Arrange {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF STUDENTE: ");
		int n =sc.nextInt();
		float temp;
		System.out.println("Enter the heights of students: ");
		float a[] = new float[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextFloat();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]>a[j])
			{   temp= a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		}
		
	}

