package codes_26nov;

import java.util.Scanner;

public class FindFactorial {
	
	public static long calcfactorial()
	{
		System.out.println("Enter the number to calculate the factorial :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long fact = 1;
		
		if(n<=0)
		{
			System.out.println("The negative number factorial could not be calculated");
		}
		
		for (int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long factorial = calcfactorial();
		System.out.println(factorial);

	}

}
