package codes_30Nov;

import java.util.HashSet;

public class Removeduplicateinstring {

	
	static String removedup(String str)
	{
		int n= str.length();
		
		// Create a HashSet to store unique characters
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
     
        // Iterate through the string
        for (int i = 0; i < n; i++) 
        {
            char currentChar = str.charAt(i);
            
            // If the character is not in the set-> add it to the result and the set
            if (!set.contains(currentChar))
            {
                result.append(currentChar);
                set.add(currentChar);
            }
        }
        
        return result.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aaaadfghjdfghjdfgh";
		String output = removedup(input);
		
		System.out.println("After removing duplicated from te input string:" +output);
		
		

	}

}
