package dsa.Btree;
import java.util.*;
public class Countofnode {
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
	
	
	static class Binarytree{
		static int idx = -1;
		public static node buildTree(int tree[]){
			idx++;
			if(idx >= tree.length || idx == -1) {
				return null;
			}
			node newNode = new node(tree[idx]);
			
			newNode.left = buildTree(tree);
			newNode.right = buildTree(tree);
			
			return newNode;
			
		}
		
		public static int countOfNodes(node root) {
			
			if(root == null) {
				return 0;
			}
			int leftNodes = countOfNodes(root.left);
			int rightNodes = countOfNodes(root.right);
			
			return leftNodes + rightNodes + 1;
		}
		
	}
	
	
	
	
	
	public static void main(String args[]) {
		int tree[] = {1,2,3,4,5,67,8,9};
		Binarytree newTree = new Binarytree();
		node root = newTree.buildTree(tree);
		System.out.println(root.data);
		System.out.println(Binarytree.countOfNodes(root));
	}
 }
