package LinkedList;

public class SinglyLL {
	
	public class Node{
		private int value;
		private Node next;
		
		public Node(int value){
			this.value = value;
		}
		
		public Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	public int size;
	
	public SinglyLL() {
		this.size = 0;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		
		if(tail == null) {
			tail = head;
		}
		
		size++;
	}
	
	
	public void addLast(int value) {
		if(tail == null) {
			addFirst(value);
			return;
		}
		
		Node newNode = new Node(value);
		tail.next = newNode;
		tail = newNode;
		size++;
	}
	
	
	public void addAt(int val, int idx) {
		if(idx == 0) {
			addFirst(val);
			return;
		}
		
		if(idx == size) {
			addLast(val);
			return;
		}
		Node temp = head;
		for(int i=1; i<idx; i++) {
			temp = temp.next;
		}
		Node newNode = new Node(val,temp.next);
		temp.next = newNode;
		size++;
	}
	
	
	
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		
		size--;
		return val; 
	}
	
	
	public int deleteLast() {
		if(tail.next == null) {
			deleteFirst();
		}
		
		int val = tail.value;
		Node secondLastNode = get(size-2);
		tail = secondLastNode;
		tail.next = null;
		size--;
		return val;
	}
	
	public Node get(int idx) {
		Node temp = head;
		for(int i=0; i<idx; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	
	public int deleteAt(int idx) {
		if(idx == 0) {
			return deleteFirst();
		}
		if(idx == size-1) {
			return deleteLast();
		}
		Node prev = get(idx-1);
		int val = prev.next.value; 
		prev.next = prev.next.next;
		size--;
		return val;
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
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	
	

}
