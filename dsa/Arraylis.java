package dsa;
import java.util.ArrayList;
import java.util.Collections;


public class Arraylis {
	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList();
		//add elements
		list1.add(9);
		list1.add(18);
		list1.add(45);
		list1.add(1,56);
        System.out.println(list1);
        
        // get element by index
        int ele = list1.get(3);
        System.out.println(ele);
        
        // set element 
        list1.set(1, 34);
        System.out.println(list1);
        
        // remove element by index
        list1.remove(2);
        System.out.println(list1);
        
        //size of list
        int size = list1.size();
        System.out.println(size);
        
        //loops
        for(int i=0; i<list1.size(); i++) {
        	System.out.println(list1.get(i));
            System.out.println();	
        }
        
        //sorting 
        Collections.sort(list1);
        System.out.println(list1);
        
        
	}

}
