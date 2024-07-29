package dsa.Hash;
import java.util.*;
public class SubarrSumIsequalTok {
	public static void main(String args[]) {
		int arr[] = {10,2,-2,-20,10};   //ans will be 3
		int k = -10;
		//sum-k = sub(i-1)
		
		HashMap<Integer, Integer> map = new HashMap<>();  //sum,freq
		map.put(0,1);  //empty subarr
		int sum = 0;
		int ans = 0;
		for(int i=0; i<arr.length; i++) {
			
			sum+= arr[i];   //calculate sum of all prev subarr 
			
			if(map.containsKey(sum-k)) {   //if sum-k exist in map
				ans += map.get(sum-k);     // add freq of sum-k in ans
			}
			
			if(map.containsKey(sum)) {     // if sum exist in map
				map.put(sum, map.get(sum)+1);   // update freq by 1
			}else {    // if not
				map.put(sum, 1);       //set freq to 1
			}
		}
		
		System.out.println(ans);
		
	}

}
