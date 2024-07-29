package dsa.Hash;
import java.util.HashSet;
import java.util.Iterator;

public class hashset1{
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(4);
		set.add(6);
		set.add(2);
		set.add(1);
		
		
		// add element
		if(set.contains(1)) {
			System.out.println("1 exist ");
		}
		if(!set.contains(9)) {
			System.out.println("does not exist");
		}
		
		
		//remove element
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("we deleted 1");
		}
		
	
		//size
		System.out.println("size of the set is "+ set.size());
		
		//print all elements
		
		System.out.println("all elements in set is "+ set);
		
		
		//iterator
		
		Iterator it = set.iterator();
		
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
		
		
	}

}
