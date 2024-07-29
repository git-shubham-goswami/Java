package Questions;
import java.util.*;
public class subseq {
	
	static void findSubSeq(String p, String up) {
		if(up.isEmpty()) {
			System.out.print(p+ " ");
			return;
		}
		char ch = up.charAt(0);
		 findSubSeq(p, up.substring(1));  //ignore
		 findSubSeq(p + ch, up.substring(1));  //take it
		
	}
	
	
	static ArrayList<String> subSeq(String p, String up){
		
		if(up.isEmpty()) {
		   ArrayList<String> list = new ArrayList();
		  list.add(p);
		  return list;
		}
		
		char ch = up.charAt(0);
		
		ArrayList<String> left = subSeq(p,up.substring(1));
		ArrayList<String> right = subSeq(p+ch, up.substring(1));
		left.addAll(right);
		return left;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(subSeq(" ","abc"));
	}

}
