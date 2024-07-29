package LinkedList;

public class CircularLL {
	
	private Node head;
	private Node tail;
	public int size;
	
	public CircularLL(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	class Node{
		 int value;
		 Node next;
		
		public Node(int val) {
			this.value = val;
		}
	}
	
	public void add(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		
		tail.next = newNode;
		newNode.next = head;
		tail = newNode;
	}
	
	 public void delete(int val){
		 Node temp = head;
		 if(temp == null) {
			 return;
		 }
		 
		 if(temp.value == val) {
			 head = head.next;
			 tail.next = head;
		 }
		 
		 do {
			 Node n = temp.next;
			 if(n.value == val) {
				 temp.next = n.next;
				 break;
			 }
			 temp = temp.next;
		 }while(temp!=head);
	 }
	
	
	public void display() {
		Node temp = head;
		if(head != null) {
			do {
				System.out.print(temp.value + " -> ");
				temp = temp.next;
			}while(temp != head);
			System.out.println("Head");
		}
	}
	

}
