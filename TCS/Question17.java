package TCS;
//to convert a given string into lowercase
public class Question17 {
	
	private static String lowercase(String str) {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch>='A' && ch <='Z') {
				ch = (char) (ch+32);
			}
			s.append(ch);
		}
		
		return s.toString();
		
		
	}
	
	public static void main(String[] args) {
		String str = "SHUBham";
		String result = lowercase(str);
		System.out.println(result);
	
	
	}

}
