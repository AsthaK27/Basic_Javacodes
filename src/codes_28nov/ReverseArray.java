package codes_28nov;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
	
	public static void revarray() 
	{
		//using stack
        int[] array = {10,20,30,40,50};
        System.out.println("Original Array: " + Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();
        for (int num : array) {
            stack.push(num);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revarray();

	}

}
