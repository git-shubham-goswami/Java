package dsa.Hash;
import java.util.*;
public class MajorityElements {
	public static void main(String args[]) {
		int arr[] = {1,3,2,5,1,3,1,5,1};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {  //key exist
				map.put(arr[i] , map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);	
			}
		}
		
		for(int key : map.keySet()) {
			if(map.get(key) > (arr.length)/3) {
				System.out.println(key);
			}
		} 
		
	}

}
