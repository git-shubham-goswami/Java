package dsa.Hash;
import java.util.*;
public class Finditineary {   //journey path
	
	
	public static String findStart(HashMap<String,String> ticket) {
		
		HashMap<String , String> reverseMap = new HashMap<>();
		
		//putting the Element in reverseMap in reverse order
		for(String tk : ticket.keySet()) {   //tk = ticket key
			
			//key -> tk ;  val -> ticket.get(tk)
			reverseMap.put(ticket.get(tk), tk);	
		}
		
		//for Comparing ticket's key to reverseMap's key
		for(String tk : ticket.keySet()) {
			if(reverseMap.containsKey(tk) == false) {
				return tk;
			}
		}
		return null;
	}
	
	
	
	public static void main(String args[]) {
		HashMap<String , String> ticket = new HashMap<>();
		ticket.put("chennai", "bengluru");
		ticket.put("mumbai", "delhi");
		ticket.put("goa", "chennai");
		ticket.put("delhi", "goa");
		
		String start = findStart(ticket);   // start is mumbai
		
		while(ticket.containsKey(start)) {
			System.out.print(start+ " -> ");
			start = ticket.get(start);    // start will become delhi
			
		}
		System.out.print(start);
		
	}

}
