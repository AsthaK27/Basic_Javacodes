package codes_28nov;

import java.util.Scanner;

public class Reversewords {
	
	public static void revwords()
	{
		System.out.print("enter the string :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("Original sentance is :"+str);
		
		// Split the sentence into words
        String[] words = str.split(" ");

        // Reverse the array of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");  // Add a space between words
            }
        }
        System.out.println("Reverse sentence is :"+reversed);
        
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		revwords();
		/*
Splitting the String:
We use the split(" ") method to split the sentence into an array of words. 
This method splits based on spaces, and each word is stored in the words array.

Reversing the Array:
A StringBuilder is used to construct the reversed sentence efficiently.
We loop through the array of words in reverse order, starting from the last word 
to the first, appending each word to the StringBuilder.

Joining the Words:
We add spaces between the words as we append them.
 The condition if (i != 0) ensures we don't add an extra space at the end.*/

	}

}
