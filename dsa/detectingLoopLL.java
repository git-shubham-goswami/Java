package dsa;

public class detectingLoopLL {
	node head;
	
	public class node{
		int data;
		node next;
		
		node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void add(int data) {
		node newNode = new node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
		
	}
	
	
	public void display() {
		node curr = head;
		while(curr != null) {
			System.out.print(curr.data+ " -> ");
			curr = curr.next;
		}
		System.out.println();	
	}
	
	public boolean detectLoop() {
		node turtle = head;
		node rabbit = head;
		while(rabbit != null && rabbit.next != null){
		  turtle = turtle.next;
		  rabbit = rabbit.next.next;
		  
		  if(rabbit == turtle) {
			  return true;
			  
		  }
		}
		return false;	
	}
	
	
	public static void main(String args[]) {
		detectingLoopLL list = new detectingLoopLL();
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(79);
		list.display();
		boolean result = list.detectLoop();
		System.out.println("the condition is " +result+ " ,for the loop in list");
	}

}
