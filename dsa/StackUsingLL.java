
package dsa;

public class StackUsingLL {
	 static class node{
		int data;
		node next;
		
		public node(int data){
			this.data = data;
			this.next = null;	
		}
	}
	
	static class Stack{
		public static node head;
		public static boolean isEmpty() {
			return head==null;
		}
		
		//Push method
		public static void push(int data) {
			node newNode = new node(data);
			if(isEmpty()){
				head = newNode;
				return;
			}
			
			newNode.next = head;
			head = newNode;
			
		}
		
		//Pop method
		public static int pop() {
			if(isEmpty()){
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
			
		}
		
		//Peek method
		public static int peek() {
			if(isEmpty()){
				return -1;
			}
			int top = head.data;
			return top;
		}
	}
	
	
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(34);
		s.push(45);
		s.push(23);
		s.push(12);
		
		while(! s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
			
		}

	}
}
