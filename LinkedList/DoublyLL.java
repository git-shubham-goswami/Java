package LinkedList;

public class DoublyLL {
	
	class Node{
		private int value;
		private Node next;
		private Node prev;
		
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}
	
	
	private Node head;
	private Node tail;
	public int size;
	
	public DoublyLL() {
		this.size = 0;
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		newNode.prev = null;
		if(head != null) {
		   head.prev = newNode;
		}
		head = newNode;
		size++;
	}
	
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		Node last = head;
		newNode.next = null;
		if(head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = newNode;
		newNode.prev = last;
	}
	
	
	public Node find(int val) {
		Node temp = head;
		while(temp != null) {
			if(temp.value == val) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	
	public void addAfter(int after, int val) {
		Node newNode = new Node(val);
		Node p = find(after);
		if(p==null) {
			System.out.println("does not exist");
			return;
		}
		newNode.next = p.next;
		p.next = newNode;
		newNode.prev = p;
		if(newNode.next != null) {
			newNode.next.prev = newNode;
		}
	}
	
	
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("End");
	}

}
