package dsa;
import java.util.LinkedList;

public class Q1LL {
	//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
   public static void main(String args[]) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(5);
    list.add(8);
    list.add(3);
    list.add(8);
    list.add(7);
    list.add(3);
    int index=0;
    for(int i=0; i<list.size(); i++) {
    	if(list.get(i)==7) {
    		 index = i;
    	}
    }
    System.out.println(index);
}

}
