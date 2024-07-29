package dsa;
//find the nth node from last + delete that node
import java.util.*;

public class impQ1LL {
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
		node currNode = head;
		while(currNode != null) {
			
			System.out.print(currNode.data+ " -> ");
			currNode = currNode.next;
			
		}
		System.out.println();
	}
	   
	
	// Solution of the queation
	
	public node solution( int n) {
		if(head.next == null) {
			return null;
		}
		
		//size 
		int size=0;
		node curr = head;
		while(curr != null) {
			curr =curr.next;
			 size++;
		 }
		System.out.println(size);
		
		
		if(n==size) {
			return head.next;
			
		}
		
		int indexToSearch = size - n;
		node prveNode = head;
		int i=1;
		while(i < indexToSearch) {
			prveNode = prveNode.next;
			i++;	
		}
		
		prveNode.next = prveNode.next.next;
		return head;
	}
	
	public static void main(String args[]) {
		impQ1LL list = new impQ1LL();
		list.add(12);
		list.add(67);
		list.add(45);
		list.add(34);
		list.add(37);
		list.add(24);  
		list.display();
		list.solution(3);
		list.display();
		
	}
	

}
