package q9;

import java.util.Scanner;

public class Leapyear {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int n=sc.nextInt();
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
					System.out.println("It is a leap year");
				else
					System.out.println("It is  not a leap year");
			}
			else
				System.out.println("It is a leap year");
		}
		else
			System.out.println("It is not a leap year");
		}

}
