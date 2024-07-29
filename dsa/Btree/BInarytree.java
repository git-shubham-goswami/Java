
package dsa.Btree;
import java.util.*;

public class BInarytree {
    public static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public static class Btree {
           static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);

            return newNode;
        }
        
        
        public static void inorder(Node root) {
            if (root != null) {
                inorder(root.leftNode);
                System.out.print(root.data + " ");
                inorder(root.rightNode);
            }
        }
        
        public static void preOrder(Node root) {
            if (root != null) {
            	System.out.print(root.data + " ");
                preOrder(root.leftNode);
                preOrder(root.rightNode);
            }
        }
        
        
        public static void postorder(Node root) {
            if (root != null) {
            
               postorder(root.leftNode);
               postorder(root.rightNode);
               System.out.print(root.data + " ");
            }
        }
        
        
        public static void levelOrder(Node root) {
        	
        	Queue<Node> q = new LinkedList<>();
        	if(root==null) {
        		return;
        	}
        	q.add(root);
        	q.add(null);
        	while(!q.isEmpty()){
        		Node currNode = q.remove();
        		if(currNode == null) {
        			System.out.println();
        			if(q.isEmpty()) {
        				break;
        			}else {
        				q.add(null);
        			}	
        		}else {
        		       System.out.print(currNode.data+" ");
        		       if(currNode.leftNode != null) {
        		    	   q.add(currNode.leftNode);
        		       }
        		       if(currNode.rightNode != null) {
        		    	   q.add(currNode.rightNode);
        		       }
        		}
        	}
        }
        
        
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Btree tree = new Btree();
        Node root = tree.buildTree(nodes);
       // System.out.println(root.data);
       // Btree.preOrder(root);
        Btree.levelOrder(root);
    }
}
