package dsa.Trie;
import java.util.*;
public class StartWith {
	static class node{
		node[] children;
		boolean eow;
		
		node(){
			children = new node[26];
			for(int i=0; i<26; i++) {
				children[i] = null;
			}
			
			eow = false;
		}
	}
	
	static node root = new node();
	
	public static void insert(String word) {
		node curr = root;
		for(int i=0; i<word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			node childNode = curr.children[idx];
			if(childNode == null) {
				childNode = new node();
				curr.children[idx] = childNode;
			}
			
			curr = childNode;
			
			if(i == word.length() - 1) {
				childNode.eow = true;
			}
		}
	}
	
	
	public static boolean startWith(String prefix) {
		node curr = root;
		for(int i=0; i<prefix.length(); i++) {
			int idx = prefix.charAt(i) -'a';
			node childNode = curr.children[idx];
			if(childNode == null) {
				return false;
			} 
			
			curr = childNode;
			
		}
		return true;
		
	}
	
	public static void main(String args[]) {
		String word[] = {"apple", "app","mango","man","woman"};
		String prefix1 = "app";
		String prefix2 = "moon";
		for(int i=0; i<word.length; i++) {
			insert(word[i]);
		}
		System.out.println(startWith(prefix1));
		System.out.println(startWith(prefix2));
	}
	

}
