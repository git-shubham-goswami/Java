package TCS;
//check weather a given string is a palindrome or not
public class Question13 {
	//one way O(n)
	private static boolean palindrome1(String str) {
		
		int start = 0;
		int end = str.length()-1;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}	
		return true;
	}
	
	//another way
	private static boolean palindrome2(String str) {
		
		String reverse = new StringBuilder(str).reverse().toString();
		if(reverse.equals(str)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String str = "ragar";
		if(palindrome2(str)) {
			System.out.println(str+ " is a palindrome");
		}else {
			System.out.println(str+ " is not a palindrome");
		}
	}

}
