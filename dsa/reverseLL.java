package dsa;
import java.util.*;
public class reverseLL {
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
		
		public void reverselist() {
			node pvrNode = head;
			node currNode = head.next;
			
			while(currNode != null) {
				node nextNode = currNode.next;
				currNode.next = pvrNode;
				
				//update
				
				pvrNode = currNode;
				currNode = nextNode;
				
			}
			head.next = null;
			head = pvrNode;
			
		}
		
		public node reverseRecursive(node head) {
			if(head == null || head.next == null) {
				return head;
	  	}
			node newHead = reverseRecursive(head.next);
			head.next.next = head;
		       head.next = null;
		       return newHead;

	 }
			
		
		public void display() {
			node currNode = head;
			while(currNode != null) {
				System.out.print(currNode.data+ " -> ");
				currNode = currNode.next;
				
			}
			System.out.println();
		}
		
	
	
	
	public static void main(String args[]) {
		reverseLL list = new reverseLL ();
		list.add(1);
		list.add(66);
		list.add(78);
		
		list.display();
		list.head = list.reverseRecursive(list.head);
		list.display();
		

			
		}

}

