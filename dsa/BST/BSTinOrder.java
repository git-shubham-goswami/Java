package dsa.BST;

public class BSTinOrder {
	static class node {
		int data;
		node left;
		node right;
		
		node(int data){
			this.data = data;
			this.left = null;
			this.right = null;		
		}
	}
	
	public static node insert(node root, int val){
		if(root == null) {
			root = new node(val);
			return root;
		}
		
		if(root.data > val) {
			//left subtree
			root.left = insert(root.left, val);
		}else {
			root.right = insert(root.right,val);
		}
		
		return root;
	}
	
	public static void inOrder(node root) {
		if(root== null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	
	public static boolean search(node root, int key) {  //time complixity O(H)
		if(root==null) {
			return false;
		}
		
		if(root.data > key) {
			return search(root.left, key);
		}
		
		else if(root.data == key) {
			return true;
		}
		
		else{ //(root.data < key)
			return search(root.right, key);
			
		}
	}
	
	
	
	//delete a node
	
	public static node delete(node root, int val) {
		//search the node to delete
		if(root.data > val) {
			root.left = delete(root.left, val);
		}else if(root.data < val) {
			root.right = delete(root.right, val);
		}
		
		else {
			//case 1 val is leaf node
			if(root.left == null && root.right == null) {
				return null;
			}
			
			
			//case 2 only one child exist of node that will be detele
			if(root.left == null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}
			
			
			//case 3 both child exist 
			node successor = inOrderSuccessor(root.right);
			root.data = successor.data;
			root.right = delete(root.right, successor.data);
		}
		
		return root;
	}
	
	public static node inOrderSuccessor(node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	
	
	
	
	public static void main(String args[]) {
		int values[] = {8,5,3,1,4,6,10,11,14};
		node root = null;
		
		for(int i=0; i<values.length; i++) {
			root = insert(root, values[i]);
		}
		
		inOrder(root);
		System.out.println();
		
		if(search(root,7)) {
			System.out.println("found");
		}else {
			System.out.println("noot found");
		}
		
		
		delete(root,4);
		inOrder(root);
		
		
		
	}
	

}
