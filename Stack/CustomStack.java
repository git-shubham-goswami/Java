package Stack;

public class CustomStack {
	
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	int ptr = -1;
	
	public CustomStack() {
		this(DEFAULT_SIZE);
	}
	
	public CustomStack(int size) {
		this.data = new int[size];
	}

	
	
	
	//add an item
	public boolean push(int item) {
		if(isFull()) {
			System.out.println("the stack is full");
			return false;
		}
		ptr++;
		data[ptr] = item;
		return true;
	}
	
	
	
	//removed an item
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("cannot pop item because stack is empty");
		}
		
		int removed = data[ptr];
		ptr--;
		return removed;
	}
	
	
	
	//peek an item
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("cannot peeek because stack is empty");
		}
		
		return data[ptr];
	}

	
	
	//is empty
	public boolean isEmpty() {
		
		return ptr == -1;
	}

	
	//isfull
	public boolean isFull() {
		return ptr == data.length-1;
	}
	
	
}
