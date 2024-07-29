package dsa.Btree;
import java.util.*;
public class SumofNodes {
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
		public static node buildTree(int tree[]){
			idx++;
			if(idx >= tree.length || tree[idx] == -1) {
				return null;
			}
			node newNode = new node(tree[idx]);
			newNode.left = buildTree(tree);
			newNode.right = buildTree(tree);
			
			return newNode;
			
		}
	}
	
	
	public static int sumOfNodes(node root) {
		if(root == null) {
			return 0;
		}
		
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		
		return leftSum + rightSum + root.data;
	}
	
	
	public static int sumOfK(node root, node k) {
		if(root == null || k < 0) {
			return 0;
		}
		
		int leftsum = sumOfK(k.left);
		int rightsum = sumOfK(k.right);
		
		return leftsum + rightsum + k.data;
		
	}
	
	
	
	
	public static void main(String args[]) {
		int tree[] = {1,2,3,4,5,-1,-1,6};
		BinaryTree newTree = new BinaryTree();
		node root = newTree.buildTree(tree);
		System.out.println(sumOfNodes(root));
		node k = 2;
		System.out.println(sumOfK(root, k));
	}

}
