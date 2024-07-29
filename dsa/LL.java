package dsa;

public class LL {
	
	private int size;
	
	LL(){
		this.size=0;
		
	}
	
	node head;
	
	public class node{
		String data;
		node next;
		
		
	  node(String data){
		  
		  this.data = data;
		  this.next = null;
		  size++;
		  
	  }
    }
	
	// add first
	public void addFirst(String data) {
		node newnode = new node(data);
		if(head==null) {
			head = newnode;
			return;	
		   }
		
		newnode.next = head;
		head = newnode;
		
	}
	
	// display list
	public void printList() {
		node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+ " -> ");
			currNode = currNode.next;
			
			
		}
		System.out.println("null");
		
	}
	
	
	//add last
	
      public void addLast(String data) {
    	  node newNode = new node(data);
    	  if(head == null) {
    		  head = newNode;
    		  return;
    		  
    	  }
    	  
    	  
    	  node lastNode = head;
    	  while(lastNode.next != null) {
    		  lastNode = lastNode.next;
    		  
    	  }
    	  
    	  lastNode.next = newNode;
    	  
	
      }
      
      // remove first
      
      public void removeFirst() {
    	  if(head == null) {
    		  System.out.println("list is empty");  
    		  return;
    		  }
    	 
    	       head = head.next;
    	       size--;
      }
        
      
      // remove Last
      
      public void removelast() {
    	
    	  if(head == null) {         // 1st corner case
    		  System.out.println("list is empty");
    		  return;  
    	  }
    	  size--;
    	  
    	  if(head.next == null) {
    		  head = null;
    		  return;
    		  
    	  }
    	  node  secondLast = head;
    	  node lastNode = head.next;            //if head.next -> null   so, lastNode = null
    	  while(lastNode.next != null) {        // and here we're checking lastnode.next == null which doesn't exist so second corner case
    		  lastNode = lastNode.next;     
    		  secondLast = secondLast.next;  
    		  
    	  }
    	  
    	  secondLast.next = null;
    	  
    	  
      }
      
      public int getSize() {
    	  return size;
      }
	
	public static void main(String args[]) {
		LL list = new LL();
		list.addFirst("my");
		list.addFirst("sorry");
		list.addLast("mistake");
		list.printList();
		System.out.println(list.getSize());
		list.removeFirst();
		list.printList();
	    list.removelast();
	    list.addFirst("very");
	    list.printList();
	 
	    System.out.println(list.getSize());
		
	}

}
