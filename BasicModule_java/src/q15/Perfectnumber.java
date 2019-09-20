package q15;

import java.util.Scanner;

public class Perfectnumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number  ");
		int n=sc.nextInt();
		int sum=0;
		System.out.print("The divisors of the number are ");
		for(int i=1;i<=n/2;i++)
		{
		 if(n%i==0) {
			 System.out.print(i+" ");
			 sum=sum+i;}
		}
		System.out.printf("\n");
		System.out.println("The sum of the divisors are "+sum);
		if(n==sum)
		{
			System.out.println("It is a perfect numbe");
		}
		else
			System.out.println("It is not a perfect numbe");
	}
}
