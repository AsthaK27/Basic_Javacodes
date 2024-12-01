package codes_27nov;

import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num :");
		int a = sc.nextInt();
		System.out.println("Enter the second num :");
		int b = sc.nextInt();
		
		System.out.println("Before swapping a and b values are :"+a +b);
		
		 a = a+b; //10,20 = 30
		 b = a-b; //30-20 = 10
		 a = a-b; //30-10 = 20
		 
		 System.out.println("After swapping a and b values are :"+a +b);
		 
		

	}

}
