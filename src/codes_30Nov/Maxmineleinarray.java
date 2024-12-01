package codes_30Nov;

public class Maxmineleinarray {
	
	public static int findmaxele(int[] arr, int max)
	{
		int n= arr.length;
		max = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int findminele(int [] arr,int min)
	{
		int n= arr.length;
		min = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,7,2,4,9};
		int n= arr.length;
		System.out.println("Minimum element is: "
                + findmaxele(arr, n));
System.out.println("Maximum element is: "
                + findminele(arr, n));

	}

}
