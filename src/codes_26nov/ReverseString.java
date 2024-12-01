package codes_26nov;

import java.util.Scanner;

public class ReverseString {

	static void reversethestring()
	{
		System.out.println("Enter the string :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String rev="";
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse string is : " +rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversethestring();
		

	}

}
