package Tree;
import Tree.BTree.BinaryTree;
import Tree.BSTree.BST;
public class Main {
	public static void main(String[] args) {
		
		
		
		BST tree2 = new BST();
		tree2.insert(25);
		tree2.insert(56);
		tree2.insert(85);
		tree2.insert(69);
		tree2.insert(23);
		tree2.levelOrder();
		
		System.out.println();
		
		System.out.println(tree2.countNodes());
		System.out.println(tree2.sumOfNodes());
		System.out.println(tree2.height());
		System.out.println(tree2.diameter());
		
	} 

}
