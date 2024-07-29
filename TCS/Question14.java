package TCS;
//reverse the words in a given sentence without using any library


public class Question14 {
	
	private static String reverse(String str) {
		String[] words = str.split(" ");
		String reversedString = "";
		
		for(int i=0; i<words.length; i++) {
			String W = words[i];
			String RW = "";
			
			for(int j=W.length()-1; j>=0; j--) {
				RW = RW + W.charAt(j);
			}
			
			reversedString = reversedString + RW + " ";
		}
		return reversedString;
	}
	
	public static void main(String[] args) {
		String str = "Hello World";
		String result = reverse(str);
		System.out.println(result);
	}
}
