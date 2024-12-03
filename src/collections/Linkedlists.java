package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>(); //Creating arraylist  
		
		ll.add("Ravi");//Adding object in arraylist  
		ll.add("Vijay");  
		ll.add("Ravi");  
		ll.add(3,"Ajay"); 
		ll.add(4,"Astha"); 
		System.out.println("Size of the list is :"+ll.size()); //size of the list
		System.out.println(ll);

        ll.set(1,"Anshul"); //changing the value of an element
        System.out.println(ll);
        
        ll.remove("Ravi"); //removing the elements
        //ll.removeFirst();
        //ll.removeLast();
        System.out.println(ll);
        
        //linked list to array
        Object[] arr = ll.toArray();
        for(Object element : arr)
        {
        	System.out.println(element);
        }
        
        
	}

}
