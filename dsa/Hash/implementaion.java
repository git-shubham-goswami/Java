package dsa.Hash;
import java.util.*;

public class implementaion {
	static class HashMap<k,v>{   //we use <k,v> cuz we dont know the type of key or value yet its callde "generics"
		private class Node{
			k key;
			v value;
			
			public Node(k key, v value) {    //constructor of Node class
				this.key = key;
				this.value = value;
			}
		}
		
		private int n;  //total no of nodes
		private int N;  //total no of Bucket
		private LinkedList<Node> buckets[];   //N = buckets.length
		
		
		public HashMap() {   //constructor for HashMap class
			            //size of buckets arr
			this.N = 4;  // total number of buckets
			this.buckets = new LinkedList[4];
			for(int i=0; i<4; i++) {
				this.buckets[i] = new LinkedList<>();
			}
		}
		
		
		 private int hashFunction(k key){ 
			int bi = key.hashCode();   //hashCode() can give 23930 or -23223 
			int positive = Math.abs(bi) % N;  // to convert -2345 to 2345  or bi should be o to (N-1)
			return positive;
			
		}
		
		
		
	   private int searchInLL(k key , int bi) {
		   LinkedList<Node> ll = buckets[bi];
		   
		   for(int i=0; i<ll.size(); i++) {
			   if(ll.get(i).key == key) {
				   return i;
			   }
		   }
		   
		   return -1;
	   }
	   
	   
	   private void rehash() {
		   LinkedList<Node> oldBuckets[] = buckets;
		   buckets = new LinkedList[N*2];
		   for(int i=0; i<N*2; i++) {
			   buckets[i] = new LinkedList<>();
		   }
		   
		   for(int i=0; i<oldBuckets.length; i++) {
			   LinkedList<Node> ll = oldBuckets[i];
			   for(int j=0; j<ll.size(); i++) {
				   Node node = ll.get(j);
				   put(node.key, node.value);
			   }
		   }
		    
	   }
		
		//put
		public void put(k key, v value) {
			int bi = hashFunction(key);  //bucket index
			int di = searchInLL(key,bi);  //data index
			 if(di == -1) {  //key doesnot exist
				 buckets[bi].add(new Node(key, value));
				 n++;
			 }else {  //key does exist
				 Node node = buckets[bi].get(di);
				node.value = value;
				 
			 }
			
			 
			 double lambda = (double)n/N;
			 double k = 2.0;
			 if(lambda > k) {
				 //rehashing
				 rehash();				 
			 }
		}
		
		//get
		public v get(k key) {
			int bi = hashFunction(key);
			int di = searchInLL(key,bi);
			
			if(di == -1) {   //key doesn't exist
				return null;
			}else {    //key exist
				Node node  = buckets[bi].get(di);
				return node.value;
			}
		}
		
		
		
		//containsKey()
		public boolean containsKey(k key) {
			int bi = hashFunction(key);
			int di = searchInLL(key,bi);
			
			if(di == -1) {      //key doesn't exist
				return false;
			}else {              //key exist
				return true;
			}
		}
		
		
		
		//remove
		public v remove(k key) {
			int bi = hashFunction(key);
			int di = searchInLL(key,bi);
			
			if(di == -1) {     //key doesn't exist
				return null;
			}else {             //key exist
				Node node = buckets[bi].remove(di);
				n--;
				return node.value;
			}
		}
		
		
		
		//isEmpty()
		public boolean isEmpty() {
			return n==0;    //     total no of nodes in LL = 0 buckets is empty
		}
		
		
		
		
		// keyset()     its returns all keys
		public ArrayList<k> keySet(){
			ArrayList<k> keys = new ArrayList<>();
			
			for(int i=0; i<buckets.length; i++) {
				LinkedList<Node> ll = buckets[i];
				for(int j=0; j<ll.size(); j++) {
					Node node = ll.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		}
		
		
	}
	
	public static void main(String args[]) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("india", 120);
		map.put("us", 50);
		map.put("uk", 80);
		map.put("china", 100);
		
		ArrayList<String> keys = map.keySet();
		for(int i=0; i<keys.size(); i++) {
			System.out.println(keys.get(i)  +" "+  map.get(keys.get(i)));
		}
		
	}

}
