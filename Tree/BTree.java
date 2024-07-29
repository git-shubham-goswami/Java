package Tree;
import java.util.*;

import Tree.BTree.BinaryTree;
public class BTree {
	static class Node{
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
		}
	}
	
	//BinaryTree class
	public static class BinaryTree{
		private Node root;
		//constructor
		BinaryTree(){
			root = null;
		}
		
		//insert method
		public void insert(int data) {
			root = insertRec(root,data);
		}
		private Node insertRec(Node node, int data) {
			if(node == null) {
				node = new Node(data);
				return node;
			}
			if(data < node.value) {
				node.left = insertRec(node.left, data);
			}else if(data > node.value) {
				node.right = insertRec(node.right, data);
			}
			
			return node;
		}
		
		
		//display
		public void display() {
	        display(root, 0);
	    }

	    private void display(Node node, int level) {
	        if (node != null) {
	            display(node.right, level + 1);
	            for (int i = 0; i < level; i++) {
	                System.out.print("    "); // Adjust the number of spaces as needed
	            }
	            System.out.println(node.value);
	            display(node.left, level + 1);
	        }
	    }
		
	    
	}
	
	
	    
	    
}
