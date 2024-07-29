package dsa.Btree;
import java.util.*;

public class LevelOrder {
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
	
	
	static class BinaryTree{
		
		static int idx = -1;
		public static node buildTree(int tree[]) {
			idx++;
			if(idx >= tree.length || idx == -1) {
				return null;
			}
			node newNode = new node(tree[idx]);
			newNode.left = buildTree(tree);
			newNode.right = buildTree(tree);
			
			return newNode;
		}
	}
	
	public static void levelOrder(node root) {
	    if (root == null) {
	        return;
	    }
	    Queue<node> q = new LinkedList<>();
	    q.add(root);
	    while (!q.isEmpty()) {
	        int levelSize = q.size(); // Get the number of nodes in the current level
	        for (int i = 0; i < levelSize; i++) {
	            node currNode = q.remove();
	            System.out.print(currNode.data + " ");
	            if (currNode.left != null) {
	                q.add(currNode.left);
	            }
	            if (currNode.right != null) {
	                q.add(currNode.right);
	            }
	        }
	        System.out.println(); // Move to the next line after printing the current level
	    }
	}

	
	
	
	public static void main(String args[]) {
		int tree[] = {1,2,3,4,5,6,8,6};
		BinaryTree newTree = new BinaryTree();
		node root = newTree.buildTree(tree);
		levelOrder(root);
	}

}
