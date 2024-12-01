package codes_30Nov;

public class OccurenceofIntegerinarray {

	static void countfrquency(int[] arr)
	{

		int n = arr.length;
        
        // If the array is empty, return
        if (n == 0) 
        {
            System.out.println("Array is empty");
            return;
        }
        
        //Loop through the array to count frequencies
        int count = 1; // Start counting from the first element
        for (int i = 1; i < n; i++) 
        {
            // If current element is the same as the previous one, increase count
            if (arr[i] == arr[i - 1]) 
            {
                count++;
            } 
            else 
            {
                // Print the frequency of the previous element
                System.out.println(arr[i - 1] + " occurs " + count + " time(s)");
                count = 1; // Reset count for the new element
            }
        }
        // Print the frequency of the last element
        System.out.println(arr[n - 1] + " occurs " + count + " time(s)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5};
	        
		 countfrquency(arr); // Call the method to count frequencies

	}

}
