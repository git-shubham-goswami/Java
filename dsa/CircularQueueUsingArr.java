package dsa;

public class CircularQueueUsingArr {
	static class CircularQueue{
		static int arr[];
		static int size;
		static int rare = -1;
		static int front = -1;
		
		CircularQueue(int n){
			arr = new int[n];
			this.size = n;
		}
		
		public static boolean isEmpty() {
			return rare == -1 && front == -1;
		}
		
		public static boolean isFull() {
			return (rare+1)%size == front;
		}
		
		
		//enqueue
		public static void add(int data) {
			if(isFull()) {
				System.out.println("queue full");	
			}
			//1st element add
			if(front == -1) {
				front = 0;
			}
			
			rare = (rare+1)% size;
			arr[rare] = data;
		}
		
		
		
		//dequeue
		public static int remove() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			
			int result = arr[front];
			//if there is a single element
			if(rare == front) {
				rare = front = -1;
			}
			else {
				front = (front+1)%size;
			}
		    return result;
		}
		
		
		
		//peek
		public static int peek() {
			if(isEmpty()) {
				System.out.println("empty Queue");
			}	
			return arr[front];
		}
	}
	
	public static void main(String args[]) {
		CircularQueue q = new CircularQueue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		q.add(6);
		
		while(!q.isEmpty()) {
			System.out.print(" "+q.peek());
			q.remove();
			
		}
	}
	
	

}
