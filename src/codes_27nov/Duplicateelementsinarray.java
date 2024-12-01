package codes_27nov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Duplicateelementsinarray {
	
	public static void findDuplicateelementsinarray()
	{
		int[] array = {10,20,30,50,50,50,30,30,30};
		//find the frequency of every element
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		for(int i : array)
		{
			count.put(i, count.getOrDefault(i, 0) + 1);
			System.out.println(i);
		}
		//Move all those elements to result whose count is > 1
		List<Integer> res = new ArrayList<Integer>();
		for (HashMap.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1)
            {
                res.add(entry.getKey());
            }
        }
		//Print the duplicate ones
		for (int x : res) {
            System.out.println(x + "is the duplicate element ");
        }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicateelementsinarray();

	}

}
