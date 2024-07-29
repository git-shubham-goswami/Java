package dsa.Btree;

import dsa.Btree.HeightOfTree.node;

public class IdenticalTree {
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
		
		
		public static boolean isIdentical(node root, node subRoot) {
			if(root == null && subRoot == null) {
				return true;
			}
			
			if(root == null || subRoot == null) {
				return false;
			}
			
			if(root.data == subRoot.data) {
				return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
			}
			return false;
			
		}
		
		
		public static boolean isSubtree(node root , node subRoot) {
			if(subRoot == null) {
				return true;
			}
			if(root == null) {
				return false;
			}
			
			if(root.data == subRoot.data) {
				if(isIdentical(root,subRoot)) {
					return true;
				}
			}
			return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot);
			
		}
		
		
		public static void main(String args[]) {
			int tree[] = {2,3,4,-1,-1,5,6,-1,4,7,6};
			BinaryTree newTree = new BinaryTree();
			node root = newTree.buildTree(tree);
			
			int sub[] = {5,6,-1,8};
			BinaryTree subTree = new BinaryTree();
			node subRoot = subTree.buildTree(sub);
			System.out.println(isSubtree(root,subRoot));
					
		}

}
