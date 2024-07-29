package dsa.Trie;
import java.util.*;

public class Implementation {
	
	static class node{
		node[] childrenArray;  //It's an array containing references to child nodes.
		boolean eow;
		
		node(){     //constructor
			childrenArray = new node[26];  // a to z
			for(int i=0; i<26; i++) {  // insilized the arr for each node with null
				childrenArray[i] =null;
			}
			eow = false;	
		}
	}
	
	static node root = new node();
	
	
	//insert
	public static void insert(String word) {  //O(L)
		node Root = root;
		for(int i=0; i<word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			node childNode = Root.childrenArray[idx];
			if(childNode == null) {  // if node doesn't exist
				//add new node
				childNode = new node();
				Root.childrenArray[idx] = childNode;
			}
			  // check for word complete
			if(i == word.length()-1) {
				childNode.eow = true;
			}
		
			  // if node exist go to next node
				Root = childNode;
		}
	}
	
	//search
	public static boolean search(String key) {
		node Root = root;
		for(int i=0; i<key.length(); i++) {
			int idx = key.charAt(i) - 'a';   // Convert character to an index
			node childNode = Root.childrenArray[idx];
			if(childNode == null) {  // if charachter doesn't exist
				return false;
			}
			
			// if exist
			Root = childNode;
			 
			// check for word complete
			if(i == key.length()-1 && childNode.eow == false) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String args[]) {
		
		String words[] = {"the","a","there","their","any"};
		for(int i=0; i<words.length; i++) {
			insert(words[i]);
		}
		
		System.out.println(search("their"));
		System.out.println(search("thor"));
		
	}

}
