package Queue;

public class CircularQueue {
	
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	int size = 0;
	int front = 0;
	int end = 0;
	
	public CircularQueue() {
		this(DEFAULT_SIZE);
	}
	
	public CircularQueue(int size) {
		this.data = new int[size];
	}
	
	
	//insert
	public boolean insert(int item)throws Exception {
		if(isFull()) {
			throw new Exception("queue is full");
		}
		data[end++] = item;
		end = end % data.length;
		size++;
		return true;
	}
	
	
	//remove
	public int remove() throws Exception  {
		if(isEmpty()) {
			throw new Exception("queue is empty");
		}
		int removed = data[front++];
		front = front % data.length;
		size--;
		return removed;
		
	}

	
	//diaplay
	public void display() {
		if(isEmpty()) {
			System.out.println("empty");
			return;
		}
		int i = front;
		do {
			System.out.print(data[i] + "->");
			i++;
			i = (i+1) % data.length;
		}while(i != end);
		System.out.println("end");
	}
	
	//is empty
	public boolean isEmpty() {
		return size == 0;
	}

	
	//isfull
	public boolean isFull() {
		return size == data.length;
	}

}
