package Queue;
import java.util.*;
public class CustomQueue {
	
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int end = 0;
	
	public CustomQueue(){
		this(DEFAULT_SIZE);
	}
	
	public CustomQueue(int size) {
		this.data = new int[size];
	}
	
	
	//insert 
	public boolean insert(int item) throws Exception {
		if(isFull()) {
			throw new Exception("cannot insert item queue is full");
		}
		
		 data[end++] = item;
		 return true;
	}
	
	
	
	//remove
	public int remove() throws Exception {
		if(isEmpty()) {
			throw new Exception("cannot remove item queue is empty");
		}
		
		int removed = data[0];
		
		for(int i=1; i<end; i++) {
			data[i-1] = data[i];
		}
		
		end--;
		return removed;
	}
	
	
	
	//front 
	public int front() throws Exception{
		if(isEmpty()) {
			throw new Exception("cannot remove item queue is empty");
		}
		return data[0];
	}
	
	
	
	//display
	public void display() throws Exception{
		if(isEmpty()) {
			throw new Exception("cannot display any item queue is empty");
		}
		for(int i=0; i<end; i++) {
			System.out.print(data[i] + " <- ");
		}
		
		System.out.println("end");
	}
	
	
	
	
	
	//is empty
		public boolean isEmpty() {
			
			return end == 0;
		}

		
		//isfull
		public boolean isFull() {
			return end == data.length;
		}
		

}
