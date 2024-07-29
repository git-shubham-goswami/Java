package TCS;
// to check the total number of vowels and consonants in a string
public class Question15 {
	
	private static void countVowels(String str) {
		int v = 0;
		int c = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
				v++;
			}else if(ch >= 'a' && ch <= 'z') {
				c++;
			}
			
		}
		System.out.println("Vowels: " +v+ " Consonants: " +c);
		
	}
	
	public static void main(String[] args) {
		String str = "Hello  World";
		countVowels(str);
				
	}

}
