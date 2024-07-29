package dsa.BST;

import java.util.ArrayList;

public class PrintInRange {
	static class node{
	     int data;
	     node left;
	     node right;
	     
	     node(int data){
	    	 this.data = data;
	    	 this.left = null;
	    	 this.right = null;
	     }
	}
	
	public static node insert(node root, int val) {
		if(root == null) {
			root = new node(val);
			return root;
		}
		
		else if(root.data < val) {
			root.right = insert(root.right, val);
		}else {
			root.left = insert(root.left, val);
		}
		
		return root;
	}
	
	
	public static void printInRange(node root, int x, int y) {
		if(root == null) {
			return;
		}
		
		if(root.data >= x && root.data <= y) {
			printInRange(root.left,x,y);
			System.out.print(root.data+" ");
			printInRange(root.right,x,y);
		}
		
		else if(root.data >= y) {
			printInRange(root.left,x,y);
		}
		else {
			printInRange(root.right,x,y);
		}
	}
	
	
	
	
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0; i<path.size(); i++) {
			System.out.print(path.get(i)+ " -> ");
		}
		System.out.println();
	}
	
	public static void printRoot2Leaf(node root, ArrayList<Integer> path) {
		if(root == null) {
			return;
		}
		
		path.add(root.data);
		
		//for leaf
		if(root.left == null && root.right == null) {
			printPath(path);
		}else { //noon leaf
			printRoot2Leaf(root.left, path);
			printRoot2Leaf(root.right, path);
		}
		path.remove(path.size()-1);
	}
	
	
	public static void main(String args[]) {
		int values[] = {8,5,3,1,4,6,10,11,14};
		node root = null;
		
		for(int i=0; i<values.length; i++) {
			root = insert(root,values[i]);
		}
		
		printInRange(root,3,10);
		
		printRoot2Leaf(root, new ArrayList<>());
		
		
		
	}

}
