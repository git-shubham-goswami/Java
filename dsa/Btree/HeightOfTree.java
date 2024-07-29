package dsa.Btree;
import java.util.*;

import dsa.Btree.SumofNodes.node;
public class HeightOfTree {
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
			if(idx >= tree.length || tree[idx] == -1) {
				return null;
			}
			
			node newNode = new node(tree[idx]);
			
			newNode.left = buildTree(tree);
			newNode.right = buildTree(tree);
			return newNode;
		}
		
	}
	
	
	public static int height(node root) {
		if(root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		int myheight = Math.max( leftHeight, rightHeight) +1;
		return myheight;
	}
	
	// diametere (snapdead and adobe)
	public static int diameter(node root) {
		if(root==null) {
			return 0;
		}
		
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = height(root.left) + height(root.right) + 1;
		
		return Math.max(diam1, Math.max(diam2, diam3));
	}
	
	
	public static void main(String args[]) {
		int tree[] = {2,3,5,-1,-1,6,-1,-1,7,-1,8,-1,-1};
		BinaryTree newTree = new BinaryTree();
		node root = newTree.buildTree(tree);
		System.out.println(height(root));
		System.out.println(diameter(root));
	}

}
