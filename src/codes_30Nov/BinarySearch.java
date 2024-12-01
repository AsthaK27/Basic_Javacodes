package codes_30Nov;

import java.util.Arrays;

public class BinarySearch {
	
	
	public static boolean isbinarysearch(int[] arr, int target)
	{
		
		Arrays.sort(arr);
		int left =0;
		int n= arr.length;
		int right = n-1;
		
		while(left<right)
		{
			int mid = left + right/2;
			
			if(arr[mid]==target)
			{
				return true;
			}
			else if (arr[mid] < target) 
			{
                left = mid + 1;
            }
			else {
                right = mid - 1;
            }
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50,50,60,60,70,80};
		int target= 80;
		 
		if(isbinarysearch(arr,target)) {
			System.out.println("Element is found"+target);
			
		}
		else
		{
			System.out.println("Element is not found");
		}
		

	}

}
