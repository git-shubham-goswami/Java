package TCS;

import java.util.Arrays;

// to check weather two string are anagrams of ecah other of not
public class Question16 {
	
	private static boolean anagrams(String str1, String str2) {
		
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		
		if(s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str1 = "Liste";
		String str2 = "Silent";
		if(anagrams(str1, str2)) {
			System.out.println("yess");
		}else {
			System.out.println("noo");
		}
	}

}
