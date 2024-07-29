package dsa.Hash;
import java.util.HashMap;
import java.util.*;
public class hashmap {
	public static void main(String args[]) {
		// country(key) , population =(value)
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("india", 120);
		map.put("china",110);
		map.put("us", 80);
		map.put("uk", 50);
		
		System.out.println(map);
		
		//update value
		map.put("uk", 55);
		System.out.println(map);
		
		//search
		if(map.containsKey("usa")) {
			System.out.println("exist in map");
		}else {
			System.out.println("does not exist in map");
		}
		
		
		// get key value
		System.out.println(map.get("india"));
		System.out.println(map.get("usa"));
		
		
		//for(int val : arr)
		// 1st method
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.print(e.getKey() + " = ");
			System.out.println(e.getValue());
		}
		
		System.out.println("   2nth method       ");
		
		// 2nth method
		Set<String> keys = map.keySet();
		for(String key : keys ) {
			System.out.println(key+ " " +map.get(key));
		}
	}

}
