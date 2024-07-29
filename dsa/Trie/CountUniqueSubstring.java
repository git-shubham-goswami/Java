package dsa.Trie;
import java.util.*;
public class CountUniqueSubstring {
	static class node{
		node[] childrenArr;
		boolean eow;
		
		node(){
			childrenArr = new node[26];
			for(int i=0; i<26; i++) {
				childrenArr[i] = null;
			}
			
			eow = false;
		}
	}
	
	static node Root = new node();
	
	public static void insert(String str) {
		node root = Root;
		for(int i=0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			node childNode = root.childrenArr[idx];
			
			if(childNode == null) {
				childNode = new node();
				root.childrenArr[idx] = childNode;
			}
			
			if(i == str.length()-1) {
				childNode.eow = true;
			}
			
			root = childNode;
		}
	}
	
	
	
	public static int countNodes(node Root) {
		if(Root == null) {
			return 0;
		}
		int count = 0;
		for(int i=0; i<26; i++) {
		   if(Root.childrenArr[i] != null) {
			count += countNodes(Root.childrenArr[i]);
		   }
		}
		
		return count + 1;
	}
	
	public static void main(String args[]) {
		String str = "ababa";
		for(int i=0; i<str.length(); i++) {
			String suffix = str.substring(i);
			System.out.println(suffix);
			insert(suffix);
		}
		
		System.out.println(countNodes(Root));
		
	}

}
