package codes_27nov;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	//both string should have same characters, in diff order
	//using sorting approach
	
	public static void checkanagram()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string :");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string :");
		String str2 = sc.nextLine();
		//check if strings are of diff length
		if(str1.length()!=str2.length())
		{
			System.out.println("Entered strings are not anagram");
		}
		//convert string into char array
		char[] cha1 = str1.toCharArray();
		char[] cha2 = str2.toCharArray();	
		//sort the arrays
		Arrays.sort(cha1);
		Arrays.sort(cha2);
		//check is char arrays are equal have same characters
		if(Arrays.equals(cha1,cha2))
		{
		
			System.out.println("Entered strings are anagram");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkanagram();

	}

}
