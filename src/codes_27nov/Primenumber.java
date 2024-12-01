package codes_27nov;

import java.util.Scanner;

public class Primenumber {

	
	public static void findprime()
	{
		System.out.print("Enter a number to check if it is prime : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		int count=0;
		
		if(num<=1)
		{
			System.out.println("Number is not prime");
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				{
					count++;
				}
		}
		
		if(count>1) {
			System.out.println("Entered number is not prime : " +num);
		}
		else
		{
			System.out.println("Entered number is prime : " +num);
		}
			
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findprime();

	}

}
