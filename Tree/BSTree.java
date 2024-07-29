package Tree;
import java.util.*;

import Tree.BTree.Node;
public class BSTree {
	public static class Node{
		 int value;
		 Node left;
		 Node right;
		
		Node(int value){
			this.value = value;
		}
	}
	
	//Binary search tree class
	public static class BST{
		private Node root;
		
	    public BST(){
			root = null;
		}
		
		//insert
		public void insert(int data) {
			root = insertRec(root, data);
		}
		
		private Node insertRec(Node node, int data) {
			if(node == null) {
				node = new Node(data);
				return node;
			}
			
			if(data > node.value) {
				node.right = insertRec(node.right, data);
			}else if(data < node.value) {
				node.left = insertRec(node.left, data);
			}
			
			return node;
		}
		
		
		//search
		public boolean search(int key) {
			return searchRec(root, key);
		}
		private boolean searchRec(Node node,int key) {
			if(node == null) {
				return false;
			}
			
			if(node.value == key) {
				return true;
			}
			else if(node.value > key) {
				return searchRec(node.left, key);
			}else {
				return searchRec(node.right, key);
			}
		}
		
		
		//preOrder
		public void preOrder() {
			preOrderRec(root);
		}
		private void preOrderRec(Node root) {
			if(root!=null) {
				System.out.print(root.value+ " ");
				preOrderRec(root.left);
				preOrderRec(root.right);
			}
		}
		
		
		//inOrder
		public void inOrder() {
			inOrderRec(root);
		}
		private void inOrderRec(Node root) {
			if(root!=null) {
				inOrderRec(root.left);
				System.out.print(root.value+ " ");
				inOrderRec(root.right);
			}
		}
		
		
		
		//postOrder
		public void postOrder() {
			postOrderRec(root);
		}
		private void postOrderRec(Node root) {
			if(root!=null) {
				postOrderRec(root.left);
				postOrderRec(root.right);
				System.out.print(root.value+ " ");
			}
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
	    
	    
	    
	  //level order traversal
	    public void levelOrder() {
	    	levelOrderRec(root);
	    }
	    private void levelOrderRec(Node node) {
	    	if(root == null) {
	    		return;
	    	}
	    	Queue<Node> q = new LinkedList<>();
	    	q.add(node);
	    	q.add(null);
	    	while(!q.isEmpty()) {
	    		Node currNode = q.remove();
	    		if(currNode == null) {
	    			System.out.println();
	    			if(q.isEmpty()) {
	    				break;
	    			}else {
	    				q.add(null);
	    			}
	    		}else {
	    			System.out.print(currNode.value + " ");
	    			if(currNode.left != null) {
	    				q.add(currNode.left);
	    			}
	    			if(currNode.right != null) {
	    				q.add(currNode.right);
	    			}
	    		}
	    	}	
	    }
	    
	    
	    
	    //Question1 count nodes
	    public int countNodes() {
	    	return countNodesRec(root);
	    }
	    private int countNodesRec(Node node) {
	    	if(node == null) {
	    		return 0;
	    	}
	    	int left = countNodesRec(node.left);
	    	int right = countNodesRec(node.right);
	    	return left + right + 1;
	    }
	    
	    
	    
	    //question2 sum of nodes
	    public int sumOfNodes() {
	    	return sumOfNodesRec(root);
	    }
	    private int sumOfNodesRec(Node node) {
	    	if(node == null) {
	    		return 0;
	    	}
	    	int left = sumOfNodesRec(node.left);
	    	int right = sumOfNodesRec(node.right);
	    	return left + right + node.value;
	    }
	    
	    
	    //question3 height
	    public int height() {
	    	return heightRec(root);
	    }
	    private int heightRec(Node node) {
	    	if(node == null) {
	    		return 0;
	    	}
	    	int left = heightRec(node.left);
	    	int right = heightRec(node.right);
	    	int myheight = Math.max(left, right) + 1;
	    	return myheight;
	    }
	    
	    
	    //question 4 diameter 
	    public int diameter() {
	    	return diameterRec(root);
	    }
	    private int diameterRec(Node node) {
	    	if(node == null) {
	    		return 0;
	    	}
	    	int dia1 = diameterRec(node.left);
	    	int dia2 = diameterRec(node.right);
	    	int dia3 = heightRec(root.left) + heightRec(root.right) + 1;
	    	
	    	return Math.max(dia3 ,Math.max(dia1, dia2));
	    }
	}
}
