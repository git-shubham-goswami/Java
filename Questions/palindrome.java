package Questions;

public class palindrome {
	
	public static boolean isPalindrome(int n) {
		int temp = 0;
		while(n>0) {
			if(n == temp || n == temp/10) {
				return true;
			}
			temp = temp*10 + n % 10;
			n = n/10;
		}
		System.out.println(temp);
		return false;
	}
	static int temp = 0;
	public static boolean recursionPalindrome(int n) {
	
		if(n==temp || n==temp/10) {
			return true;
		}
		
		temp = temp*10 + n % 10;
		
		
		if(n==0) {
			return false;
		}
		return recursionPalindrome(n/10);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(recursionPalindrome(45));
	}

}
