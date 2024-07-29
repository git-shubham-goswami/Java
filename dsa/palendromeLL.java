package dsa;

public class palendromeLL {
	
	node head;
	 public class node{
		int data;
		node next;
		
		
		node(int data){
			this.data = data;
			this.next = null;	
	    	}
     }
	
	 
	public void add(int data){
		node newNode = new node(data);
		if(head==null) {
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
	
	
	
	public node findMiddle(node head) {
		
		node rabbit = head;
		node turtle = head;
		while(rabbit.next != null && rabbit.next.next != null ) {
			rabbit = rabbit.next.next;
			turtle = turtle.next;
		}
		return turtle;
	}
	
	
	public node reverse(node head) {
		node prve = null;
		node curr = head;
		while(curr != null) {
			node next = curr.next;
			curr.next = prve;
			prve = curr;
			curr = next;
		}
		
		return prve;
	}
	
	
	public boolean ispalendrome(){
		if(head==null || head.next== null) {
			return true;
			
		}
		 
		 
		node firstHalfStart = head;
		node middle = findMiddle(head);
		node secondHalfStart = reverse(middle.next);
		
		while(secondHalfStart != null) {
			if(firstHalfStart.data != secondHalfStart.data) {
				return false;
				
			}
		
			firstHalfStart = firstHalfStart.next;
			secondHalfStart = secondHalfStart.next;
	
		}
		return true;
	}
	
	public static void main(String args[]) {
		palendromeLL list = new palendromeLL();
	    list.add(6);
		list.add(3);
		list.add(7);
	    list.add(6);
	    list.add(6);
		list.display();
		boolean result = list.ispalendrome();
		System.out.println(result);
		
	}

}
