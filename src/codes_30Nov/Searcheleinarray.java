package codes_30Nov;

import java.util.Scanner;

public class Searcheleinarray {
	//to find an ele in array- using linear searching
	

	public static boolean findeleinarray(int[] arr,int n)
	{
		
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;  // Element found, return true
            }
        }
        return false; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50,60};
		System.out.println("enter the element to search :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Entered element is: "+n);
		
		
		if(findeleinarray(arr,n))
		{
			System.out.println("Entered element is found: "+n);
		}
		else
		{
			System.out.println("Entered element is not found in array: "+n);
		}
		
	
		

	}

}
