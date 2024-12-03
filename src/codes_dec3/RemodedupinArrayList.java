package codes_dec3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemodedupinArrayList {
	//Write a program to remove duplicates from an ArrayList
	
	/*Get the ArrayList with duplicate values.
	 * Create a LinkedHashSet from this ArrayList.
	 * This will remove the duplicates
	 * Convert this LinkedHashSet back to Arraylist.
	 * The second ArrayList contains the elements with duplicates removed.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println(l.toString());  
        Set<String> s = new LinkedHashSet<String>(l);  
        System.out.println(s);  

	}

}
