package codes_30Nov;

public class Bubble_sort {
	
	 static void Bubble_sort(int[] arr,int n)
	{
		 int i, j, temp;
	       boolean swapped;
	       
	        for (i = 0; i < n - 1; i++)
	        {
	            swapped = false;
	            for (j = 0; j < n - i - 1; j++)
	            {
	                if (arr[j] > arr[j + 1])
	                {
	                    // Swap arr[j] and arr[j+1]
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no two elements were
	            // swapped by inner loop, then break
	            if (swapped == false)
	                break;
	        }
	}
	 static void printArray(int[] arr,int size)
	 {
		
	        for (int i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println(); 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {64, 34, 25, 12, 22, 11, 90 }; //unsorted array
        int n = arr.length; //array length
        Bubble_sort(arr, n); //calling function of logic
        System.out.println("Sorted array: "); //priting array
        printArray(arr, n); //calling print function

	}

}
