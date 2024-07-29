package LinkedList;

public class main {
	public static void main(String[] args) {
		SinglyLL list = new SinglyLL();
		list.addFirst(15);
		list.addFirst(12);
		list.addFirst(78);
		list.addFirst(45);
		list.addLast(0);
		list.addAt(85, 3);
		list.display();
		
		
		DoublyLL list2 = new DoublyLL();
		list2.addFirst(12);
		list2.addFirst(45);
		list2.addFirst(56);
		list2.addFirst(5);
		list2.addFirst(89);
		list2.display();
		
		list2.addLast(45);
		list2.display();
		list2.addAfter(5, 0);
		list2.display();
		
		
		CircularLL list3 = new CircularLL();
		list3.add(15);
		list3.add(14);
		list3.add(13);
		list3.add(12);
		list3.add(11);
		list3.add(10);
		list3.display();
		list3.delete(13);
		list3.display();
	}
	

}
