package Questions;
import java.util.*;
public class asciiofchar {
	public static void subSeqAscii(String p, String up) {
		if(up.isEmpty()) {
			System.out.print(p +" ");
			
			return;
		}
		
		char ch = up.charAt(0);
		int a = ch + 0;
		
		subSeqAscii(p ,up.substring(1));
		subSeqAscii(p + ch, up.substring(1));
		subSeqAscii(p + (ch + 0) , up.substring(1));
	}
	
	public static void main(String[] args) {
		subSeqAscii(" ", "abc");
		
	}

}
