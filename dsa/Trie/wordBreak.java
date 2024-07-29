package dsa.Trie;
import java.util.*;
public class wordBreak {
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
	
	public static void insert(String word){
		 node curr = root;
		for(int i=0; i<word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			node node = curr.children[idx];
			
			if(node == null) {
				node = new node();
				curr.children[idx] = node;
			}
			
			curr = node;
			
			if(i == word.length()-1) {
				curr.eow = true;
			}
		}
	}
	
	
	
	public static boolean search(String key){
		node curr = root;
		for(int i=0; i<key.length(); i++) {
			int idx = key.charAt(i) - 'a';
			node node = curr.children[idx];
			if(node == null) {
				return false;
			}
			
			curr = node;
			
			if(i == key.length()-1 && curr.eow == false) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static boolean wordBreak(String key) {
		if(key.length() == 0) {
			return true;
		}
		
		for(int i=1; i<=key.length(); i++) {
			String firstPart = key.substring(0,i);
			String secPart = key.substring(i);
			if(search(firstPart) && wordBreak(secPart)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	public static void main(String args[]) {
		String word[] = {"i","like","sam","samsung","mobile", "ice"};
		String key = "ilikesamsung";
		for(int i=0; i<word.length; i++) {
			insert(word[i]);
		}
		System.out.println(wordBreak(key));
	}
	
	

}
