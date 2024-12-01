package codes_26nov;

public class FindLargest {
	
	 static int findLargestnumber(int[] array)
	{
		int largest = array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				largest = array[i];
			}
		}
		return largest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,20,30,40,50};
		
		int largest = findLargestnumber(array);
		System.out.println("Laregst numbr of array is :" +largest);
		
		

	}

}
