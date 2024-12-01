package codes_26nov;

import java.util.Scanner;

public class Palindrome {
	
	public static void IsPalindrome()
	{
		System.out.println("Enter a string to validate if it is palindrome :");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("String entered by the user: "+str1);
		
		StringBuilder str2 = new StringBuilder();
		str2.append(str1);
		
		str2.reverse();
		System.out.println("Reverse of the string is : "+str2);
		if(str2.equals(str1))
		{
			System.out.println("entered string is a palindrome");
		}
		else
		{
			System.out.println("Entered string is not a palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsPalindrome();

	}

}
