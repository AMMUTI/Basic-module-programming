package secondprogram;

import java.util.Scanner;

public class Amsrong {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int n =sc.nextInt();
		int count=0,r,i,ams=1,a=0,t;
		//System.out.println(n);
		t=n;
		while(t!=0)
		{
			t=t/10;
			count++;
		}
		t=n;
		while(t!=0)
		{
			r=t%10;
			a=a+(int)Math.pow(r,count);
			
			t=t/10;
		}
		if(n==a)
			System.out.println("The given number is amstrong");
		else
			System.out.println("The given number is not amstrong");
	}

}
