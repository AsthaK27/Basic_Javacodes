package collections;

import java.util.ArrayList;

public class Demoarraylistt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

      // Adding elements to ArrayList
      // at the end
      al.add("Geeks");
      al.add("Geeks");
        System.out.println("Orignal List : "+al);
        
        // Adding Elements at the specific
        // index
      al.add(1, "For");
        System.out.println("After Adding element at index 1 : "+ al);
        
        // Removing Element using index
        al.remove(0);
        System.out.println("Element removed from index 0 : "+ al);
        
        // Removing Element using the value
        al.remove("Geeks");
        System.out.println("Element Geeks removed : "+ al);
    
        // Updating value at index 0
        al.set(0, "GFG");
      // Printing all the elements in an ArrayList
      System.out.println("List after updation of value : "+al);


	}

}
