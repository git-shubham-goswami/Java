package heep;
import java.util.*;
public class ImplHeep<T extends Comparable<T>> {
	
     private ArrayList<T> list;
     
     public ImplHeep() {
    	 list = new ArrayList<>();
     }
     
     private void swap(int first, int sec) {
    	 T temp = list.get(first);
    	 list.set(first, list.get(sec));
    	 list.set(sec, temp);
     }
     
     
     private int parent(int idx) {
    	 return (idx-1)/2;
     }
     
     private int left(int idx) {
    	 return idx * 2 + 1;
     }
     
     private int right(int idx) {
    	 return idx * 2 + 2;
     }
      
     
     //insert
     public void insert(T value) {
    	 list.add(value);
    	 upHeap(list.size()-1);
     }
     public void upHeap(int idx) {
    	 if(idx == 0) {
    		 return;
    	 }
    	 
    	 int p = parent(idx);
    	 if(list.get(idx).compareTo(list.get(p)) < 0) {
    		swap(idx,p); 
    		upHeap(p);
    	 }
     }
     
     
     //remove
     public T remove() throws Exception{
    	 if(list.isEmpty()) {
    		 throw new Exception("removing from an empty list");
    	 }
    	 
    	 T temp = list.get(0);
    	 T last = list.remove(list.size() - 1);
    	 if(!list.isEmpty()) {
    		 list.set(0, last);
    		 downHeap(0);
    	 }
    	 return temp;
     }
     
     
     private void downHeap(int idx) {
    	 int min = idx;
    	 int left = left(idx);
    	 int right = right(idx);
    	 
    	 if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
    		 min = left;
    	 }
    	 
    	 if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
    		 min = right;
    	 }
    	 
    	 if(min != idx) {
    		 swap(min, idx);
    		 downHeap(min);
    	 }
     }
     
     
     //heapsort
     public ArrayList<T> heapSort() throws Exception{
    	 ArrayList<T> data = new ArrayList<>();
    	 
    	 while(!list.isEmpty()) {
    		 data.add(this.remove());
    	 }
    	 return data;
     }
     
     
     
}
