package codes_26nov;

import java.util.Scanner;

public class Fibonacciseries {
	
	public static void findfib()
	{
		System.out.println("Enter the number to create the fib series : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1=0;
		int n2=1;
		
		for (int i=0;i<n;i++)
		{
			System.out.print(n1 +" ");
			
			int fib = n1+n2; //011235
			
			n1=n2;
			n2=fib;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findfib();
		
	}

}
